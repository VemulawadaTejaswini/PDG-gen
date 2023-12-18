import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
   long N=scan.nextLong();
long p=0;
long n=0;
 for(long i=1;i<=N;i++){
     n=N/i;
     p=p+i*n*(n+1)/2;
 }
System.out.println(p);
    }
}
