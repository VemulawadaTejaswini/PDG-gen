import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        long a = N/K;
        if(K % 2 != 0){
            System.out.println(a*a*a);
        }else{
            long b = (N + K/2) / K;
            System.out.println(a*a*a + b*b*b);
        }

    }

}