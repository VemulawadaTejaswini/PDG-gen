import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int q = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < q; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(map.containsKey(b)){
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + map.get(b));
                }else{
                    map.put(c, map.get(b));
                }

                map.remove(b);
            }

            long ans = 0;

            for(Integer j : map.keySet()){
                //System.out.println(j + " "+ map.get(j));
                ans += map.get(j) * j;
            }

            sb.append(ans).append("\n");
            //System.out.println(ans);

        }
        System.out.println(sb);

    }
}
