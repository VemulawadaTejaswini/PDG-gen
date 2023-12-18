import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long m = 1;
        long c = pow10(18);
        for(int i = 0; i < n; i++){
            if(sc.nextInt() == 0){
                System.out.println(0);
                sc.close();
                return;
            }
        }
        for(int i = 0; i < n; i++){
                m *= sc.nextLong();
                if(m < 0 || m > c){
                    m = -1;
                    break;
                }
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