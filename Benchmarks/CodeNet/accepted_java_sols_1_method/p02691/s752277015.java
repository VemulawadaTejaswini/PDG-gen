import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        HashMap<Integer,Integer> mapL = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> mapR = new HashMap<Integer,Integer>();
        mapL.put(first,1);
        long ans = 0;
        for(int i = 1; i < n; i++){
            int v = sc.nextInt();
            int L = i+v;
            int R = i-v;
            if(mapL.containsKey(R)){
                ans += mapL.get(R);
            }
            if(mapL.containsKey(L)){
                mapL.put(L,mapL.get(L)+1);
            }else{
                mapL.put(L,1);
            }
        }
        System.out.println(ans);
    }
}

