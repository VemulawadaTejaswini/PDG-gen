import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s_zone[][] = new int[k][2];
        final long mod = 998244353;
        for(int i = 0; i < k; i++){
            s_zone[i][0] = sc.nextInt();
            s_zone[i][1] = sc.nextInt();
        }
        ArrayList<Integer> s = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            for(int j = s_zone[i][0]; j < s_zone[i][1] + 1; j++){
                s.add(j);
            }
        }
        //System.out.println(s);

        long pos [] = new long[n + 1];
        pos[1] = 1;
        int len = s.size();
        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < len; j++){
                if(i - s.get(j) > 0){
                    pos[i] += pos[i - s.get(j)] % mod;
                }
            }
            //System.out.println(pos[i]);    
        }
        System.out.println(pos[n] % mod);
    }
}
