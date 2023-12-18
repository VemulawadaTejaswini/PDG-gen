import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N, M ,P;
        while((N=scan.nextInt())!=0 && (M=scan.nextInt())!=0 && (P=scan.nextInt())!=0){
            int member = 0;
            int[] voteNum = new int[N+1];
            for(int i=1; i<=N; i++){
                voteNum[i] = scan.nextInt();
                member += voteNum[i];
            }

            if(voteNum[M] == 0){
                System.out.println(0);
                continue;
            }

            int pool = member*(100-P);

            System.out.println(pool/(voteNum[M]));
        }
    }
}