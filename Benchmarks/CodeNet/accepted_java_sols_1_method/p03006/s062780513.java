import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] x = new int[2][N];
        for(int i = 0; i < N; i++){
            x[0][i] = sc.nextInt();
            x[1][i] = sc.nextInt();
        }
        Map<List<List<Integer>>, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i != j){
                    List<List<Integer>> lists = new ArrayList<>();
                    List<Integer> list = new ArrayList<>();
                    list.add(x[0][i]-x[0][j]);
                    list.add(x[1][i]-x[1][j]);
                    lists.add(list);
                    if(map.containsKey(lists)){
                        map.put(lists, map.get(lists)+1);
                    } else {
                        map.put(lists, 1);
                    }
                }
            }
        }
        int max = 0;
        for(List<List<Integer>> key: map.keySet()){
            max = Math.max(map.get(key), max);
        }
        System.out.println(N-max);
    }
}