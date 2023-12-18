import java.math.BigInteger;
import java.util.Scanner;
    public class Main{
    	 public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);

    	int n=scanner.nextInt();
           int t=0;
for(int j=1;j<=n;j++) {
	int k=1;
           for(int i=2;i<=n;i++){
               // 素数になるまで...
               if(!isPrime(i)) continue;
               int c = 0;
               // 割れる間は...
               while((j % i) == 0){
                   j = j / i;
                   c += 1;
               }
               k *= c + 1;
           }
           t=t+j*k;
           }

       System.out.println(t);}

           public static boolean isPrime(long l){
               return BigInteger.valueOf(l).isProbablePrime(1);
           }
    }