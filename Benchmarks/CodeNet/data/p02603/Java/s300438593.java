import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int money = 1000;
        int stock = 0;
        boolean haveStock = false;

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        for(int i=0;i<N-1;i++){
            if(A[i] < A[i+1]){
                stock = money / A[i];
                money = money % A[i];
            }

            if(A[i] > A[i+1]){
                money += stock * A[i];
                stock = 0;
            }
        }
        System.out.println(money + (stock * A[N-1]));


    }

}


