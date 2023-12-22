
import java.util.Scanner;

public class Main {

/* (a)
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System .in);
        Integer a = scan.nextInt();
        Integer b = scan.nextInt();

        if(a <= 9 && b <= 9){
            System.out.println(a*b);
        }
        else {
            System.out.println(-1);
        }
        scan.close();
    }
*/
/* (b)
public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System .in);
        Integer num = scan.nextInt();
        String msg= "No";
    
        if(num > 81){
            System.out.println("No");
        }
        else if (1<=num && num<=9){
            System.out.println("Yes");            
        }
        else{
            for(int i=2;i<=9;i++){
                int d = num % i;
                int e = num / i;
                if(d==0 && 1<=e && e<=9){
                    msg ="Yes";
                    break;                    
                }
            }
            System.out.println(msg);
        }
        scan.close();
    }
*/
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System .in);
        long num = scan.nextLong();
        long steps = 0; 
        long preStep = (long)Math.pow(10,12);
        long j,d;

        boolean isPrime = isPrime(num);
        if (isPrime){
            steps = num - 1;
            System.out.println(steps);
        }
        else {
            for(long i=(long)Math.sqrt(num);i>=2;i--){
                d = num % i;
                if (d == 0){
                    j = num /i;
                    steps = Math.min(i+j-2,preStep);
                    preStep = steps;
                }
            }
            System.out.println(steps);            
        }

        scan.close();
    }

    public static boolean isPrime(long num) {
        if ( 1 >= num ) return false;
            
        // 2の場合は素数
        if ( 2 == num ) return true;
            // 素数判定
        int n = (int)Math.sqrt( num );
        for ( int i = 2; i <= n; ++ i ) {
        	// 余り0で割り切れるかを判定
        	if ( 0 == ( num % i ) ) return false;
        }
            // numが2～nで割り切れなかったので素数
        return true;
    }

}