import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] P = new int[M];
        String[] result = new String[M];

        for(int i=0; i<M; i++){
            P[i] = sc.nextInt();
            result[i] = sc.next();
        }

        int countAC = 0;
        int[] pena = new int[N];
        int countPena = 0;
        int[] clearFlg = new int[N];
        int[] answeredFlg = new int[N];
        for(int i=0; i < M; i++){
            if(answeredFlg[P[i]-1] == 0){
                answeredFlg[P[i]-1] = 1;
                if(result[i].equals("AC")){
                    countAC += 1;
                    clearFlg[P[i]-1] = 1;
                }else if(result[i].equals("WA")){
                    pena[P[i]-1] +=1;
                }
            }else if(answeredFlg[P[i]-1] == 1){
                if(result[i].equals("AC") && clearFlg[P[i]-1] == 0){
                    countAC += 1;
                    clearFlg[P[i]-1] = 1;
                    countPena += pena[P[i]-1];
                }else if(clearFlg[P[i]-1] == 0 && result[i].equals("WA")){
                    pena[P[i]-1] +=1;
                }
            }
        }
        System.out.println(countAC+" "+countPena);
    }
}