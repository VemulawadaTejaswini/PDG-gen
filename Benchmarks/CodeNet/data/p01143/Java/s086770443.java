import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N, M ,P;
        while((N=scan.nextInt())!=0 && (M=scan.nextInt())!=0 && (P=scan.nextInt())!=0){
            int sum = 0;
            int[] ticket = new int[100];
            for(int i=0; i<N; i++){
                int k = scan.nextInt();
                ticket[i] = k;
                sum += k;
            }
            int pool = sum*100 * (100-P)/100;

            if(ticket[M-1] == 0){
                System.out.println(0);
                continue;
            }

            System.out.println(pool/ticket[M-1]);
        }
    }
}