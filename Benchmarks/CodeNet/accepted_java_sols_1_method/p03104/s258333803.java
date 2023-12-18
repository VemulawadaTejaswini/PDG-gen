
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long res = 0;
        if(A%2 ==1){
            if(B%2 == 1){
                res =  ((B -(A+1) +1)/2) % 2;
                res ^= A;
            }else{
                res =  ((B-1 -(A+1) +1)/2) % 2;
                res ^= A;
                res ^= B;
            }
        }else{
            if(B%2 == 1){
                res =  ((B -A +1)/2) % 2;
            }else{
                res =  ((B-1 -A +1) / 2) %2;
                res += B;
            }
        }

        System.out.println(res);

    }

}
