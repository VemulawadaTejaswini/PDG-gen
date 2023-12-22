import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sN = scan.next();
        String sA = scan.next();
        String sB = scan.next();

        int N = Integer.parseInt(sN);
        int A = Integer.parseInt(sA);
        int B = Integer.parseInt(sB);
        if( 1 <= N || N <= 20 ){
            int hogeo = N * A;
            if(hogeo < B){
                System.out.println(hogeo);
            }else{
                System.out.println(B);
            }
        }
    }
}