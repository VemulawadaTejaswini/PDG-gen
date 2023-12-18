import java.util.*;

class Main{
    public static final int MOD = 2019;
    public Main(){
        Scanner SC = new Scanner(System.in);

        String S = SC.next();
        int L = S.length();
        int[] N = new int[L];
        for(int i=0;i<L;i++){
            N[i] = S.charAt(i) - '0';
        }

        Map<Integer, Integer> MAP = new HashMap<Integer, Integer>();
        int key = 0;
        int modexp10 = 1;
        for(int i=0;i<L;i++){
            key = (key + N[L-i-1] * modexp10) % MOD;
            modexp10 = modexp10 * 10 % MOD;
            int v = MAP.getOrDefault(key, 0);
            MAP.put(key, v+1);
        }

        int total = MAP.getOrDefault(0, 0);
        for(Integer i : MAP.keySet()){
            int t = MAP.get(i);
            total += t * (t - 1) / 2;
        }

        System.out.println(total);
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
