import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int M;
        int[] waCnt=null;
        boolean[] acFlg = null;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            waCnt = new int[N];
            acFlg = new boolean[N];

            for (int i = 0; i < M; i++) {
                int num = sc.nextInt();
                String rcwa = sc.next();
                if(acFlg[num-1]){
                    continue;
                }
                if(rcwa.equals("AC")){
                    acFlg[num-1] = true;
                }else{
                    waCnt[num-1]++;
                }
            }
        }
        int acResult = 0;
        int pena = 0;
        for (boolean b : acFlg){
            if(b){
                acResult++;
            }
        }
        for (int i = 0; i < N; i++) {
            if(!acFlg[i]){
                continue;
            }
            pena += waCnt[i];
        }
        System.out.println(acResult+" "+pena);
    }
}
