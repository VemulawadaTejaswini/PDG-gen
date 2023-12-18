import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    

    public static void main(String[] args)throws Exception{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] ary = new List[n];
        for(int i=0; i<n; i++){
            ary[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            ary[a-1].add(b-1);
            ary[b-1].add(a-1);
        }

        Deque<Map<String,Integer>> que = new ArrayDeque<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Map<String,Integer> map = new HashMap<>();
        map.put("from", 0);
        map.put("number", 0);
        que.add(map);

        while(!que.isEmpty()){
            Map<String,Integer> map2 = que.removeFirst();
            int from = map2.get("from");
            int number = map2.get("number");

            if(ans[number] == -1){
                ans[number] = from;

                for(int i=0; i<ary[number].size(); i++){
                    int temp = ary[number].get(i);
                    Map<String,Integer> map3 = new HashMap<>();
                    map3.put("from", number);
                    map3.put("number", temp);
                    que.add(map3);
                }
            }
        }
        System.out.println("Yes");
        for(int i=1; i<n; i++){
            System.out.println((ans[i] + 1));
        }
    }
}