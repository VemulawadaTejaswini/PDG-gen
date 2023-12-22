import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        StringBuilder strb = new StringBuilder();

        int set = 0;
        for(int k = 1 ; (M-2*k+1 >= 1) && (set < M) ; k++ ){
            strb.append(""+k+" "+(M-k+1)+"\n");
            set++;
        }
        for(int k = 1 ; (M-2*k+2 >= 1) && (set < M) ; k++ ){
            strb.append(""+(M+k)+" "+(2*M-k+2)+"\n");
            set++;
        }

        System.out.println(strb.toString());
    }
}
