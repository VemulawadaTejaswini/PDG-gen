import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();


        int pow = (int)Math.pow(100, D);
        int res = pow * N;
        if (N == 100){
            res = res + (int)Math.pow(100, D) ;
        }
        System.out.println(res);

    }
}
