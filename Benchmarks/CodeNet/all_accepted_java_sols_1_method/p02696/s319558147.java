import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long ans = 0;
        if(N >= B-1){
            ans = A*(B-1)/B;
        }else{
            ans = A*N/B;
        }

        System.out.println(ans);
    }
}
