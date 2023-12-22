import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ACcounter = new int[N];
        int[] WAcounter = new int[N];
        int AC = 0;
        int WA = 0;
        
        for(int i = 0; i < M; i++){
            int p = sc.nextInt();
            String S = sc.next();
            if(S.equals("WA") && ACcounter[p-1] == 0){
                WAcounter[p-1]++;
            }
            if(S.equals("AC")){
                ACcounter[p-1] = 1;
            }
        }
        
        for(int i = 0; i < N; i++){
            AC += ACcounter[i];
            if(ACcounter[i] == 1){
                WA += WAcounter[i];
            }
        }
        
        System.out.println(AC + " " + WA);
        
    }
}