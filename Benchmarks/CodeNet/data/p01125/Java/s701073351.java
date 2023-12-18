import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static ArrayList<Gem> alg;
    
    public static void main(String[] args) {
        for(int n; (n = scn.nextInt()) > 0;) {
            alg = createGemList(n);
            System.out.println(searchGem(scn.nextInt()) ? "Yes" : "No");
        }
    }
    
    public static ArrayList<Gem> createGemList(int n) {
        ArrayList<Gem> list = new ArrayList<>();
        for(; n > 0; n--) {
            list.add(new Gem(scn.nextInt(), scn.nextInt()));
        }
        return list;
    }
    
    public static boolean searchGem(int m) {
        ArrayList<Gem> list = new ArrayList<>(alg);
        final int[][] move = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for(int x = 10, y = 10; m > 0; m--) {
            int dir = 0;
            switch(scn.next()) {
              case "W":
                dir++;
              case "S":
                dir++;
              case "E":
                dir++;
            }
            for(int num = scn.nextInt(); num > 0; num--) {
                y += move[dir][0];
                x += move[dir][1];
                for(Gem elm : alg) {
                    if(elm.compare(x, y)) {
                        list.remove(elm);
                    }
                }
            }
        }
        return list.size() > 0 ? false : true;
    }
}

class Gem {
    private final int x_;
    private final int y_;
    
    public Gem(int x, int y) {
        x_ = x;
        y_ = y;
    }
    
    public boolean compare(int x, int y) {
        return x_ == x && y_ == y;
    }
}