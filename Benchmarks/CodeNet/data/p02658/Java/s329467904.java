import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long m = 1;
        long c = pow10(18);
        try{
            for(int i = 0; i < n; i++){
                m *= sc.nextLong();
                if(m > c || m < 0){
                    m = -1;
                }
            }
        } catch (Error e) {
            m = -1;
        }
        

        System.out.println(m);
        sc.close();
    }
    static long pow10(int n){
        long c = 1;
        for(int i = 0; i < n; i++){
            c *= 10;
        }
        return c;
    }
}