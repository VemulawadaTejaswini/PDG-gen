import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N, M ,P;
        while((N=scan.nextInt())!=0 && (M=scan.nextInt())!=0 && (P=scan.nextInt())!=0){
            int member = 0;
            int[] voteNum = new int[N];
            for(int i=0; i<N; i++){
                voteNum[i] = scan.nextInt();
                member += voteNum[i];
            }

            if(voteNum[M-1] == 0){
                System.out.println(0);
                continue;
            }

            int pool = member*100*(100-P)/100;

            System.out.println(pool/(voteNum[M-1]));
        }
    }
}