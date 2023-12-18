import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long m = 1;
        long c = pow10(18);
        int d = n;
        for(int i = 0; i < n; i++){
                m *= sc.nextLong();
                if(m > c || m < 0){
                    m = -1;
                    d = i + 1;
                    break;
                }
        }
        for(int i = d; i < n; i++){
            if(0 == sc.nextInt()){
                m = 0;
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