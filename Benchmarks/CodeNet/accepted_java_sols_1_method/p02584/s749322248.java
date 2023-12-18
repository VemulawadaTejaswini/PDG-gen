
import java.util.Arrays;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long X = scan.nextLong();
        long K = scan.nextLong();
        long D = scan.nextLong();
long k=0;
long l=Math.abs(X);
long p=0;
k=(l-l%D)/D;
if(k>K){p=Math.abs(X)-D*K;}
else if (K%2==k%2){p=Math.abs(X)-D*k;}
else{p=D*(k+1)-Math.abs(X);}
        System.out.println(p);
    }

}