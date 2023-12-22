import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String[] S = new String[N];
        for (int i = 0; i < N; ++i){
            S[i] = sc.next();
        }
        
        int[] C = new int[4];
        
        for (int i = 0; i < N; ++i){
            if(S[i].equals("AC")){
                C[0]++;
            } else if(S[i].equals("WA")){
                C[1]++;
            } else if(S[i].equals("TLE")){
                C[2]++;
            } else if(S[i].equals("RE")){
                C[3]++;
            }
        }
        
        //出力
        System.out.println("AC x " + C[0]);
        System.out.println("WA x " + C[1]);
        System.out.println("TLE x " + C[2]);
        System.out.println("RE x " + C[3]);
    }
}
