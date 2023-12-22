import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(N*A > B){

            System.out.println(B);

        }else{

            System.out.println(N*A);
        }

    }
}