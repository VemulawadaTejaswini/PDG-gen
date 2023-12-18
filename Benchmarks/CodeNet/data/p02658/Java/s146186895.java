import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 1;
        boolean isOver = false;

        for(int i=0;i<N;i++){

            long A = sc.nextLong();

            if(A == 0){
                System.out.println(0);
                System.exit(0);
            }

            if(ans >= (1000000000000000001L /A)){
                isOver = true;
            }

            ans *= A;



        }

        if(isOver){
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }


    }

}
