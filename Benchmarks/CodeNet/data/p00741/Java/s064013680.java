import java.util.*;

public class Main {
    static List<List<Integer>> searchIsland(int i, int j, int h, int w, List<List<Integer>> island) {
        if(island.get(i).get(j) == 0) return island;
        island.get(i).set(j,0);
        if(i+1 < h && j+1 < w) island = searchIsland(i+1, j+1, h, w, island);
        if(i+1 < h && j-1 >= 0) island = searchIsland(i+1, j-1, h, w, island);
        if(i-1 >= 0 && j+1 < w) island = searchIsland(i-1, j+1, h, w, island);
        if(i-1 >= 0 && j-1 >= 0) island = searchIsland(i-1, j-1, h, w, island);
        if(i+1 < h) island = searchIsland(i+1, j, h, w, island);
        if(i-1 >= 0) island = searchIsland(i-1, j, h, w, island);
        if(j+1 < w) island = searchIsland(i, j+1, h, w, island);
        if(j-1 >= 0) island = searchIsland(i, j-1, h, w, island);
        return island;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            List<List<Integer>> island = new ArrayList<>();
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w == 0 && h == 0) break;

            for(int i = 0; i < h; i++) {
                List<Integer> list = new ArrayList<>();
                for(int j = 0; j < w; j++) {
                    int x = sc.nextInt();
                    list.add(x);
                }
                island.add(list);
            }

            int count = 0;
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(island.get(i).get(j) == 1) {
                        count++;
                        island = searchIsland(i, j, h, w, island);
                    }
                }
            }
            System.out.println(count);
        }
    }
}
