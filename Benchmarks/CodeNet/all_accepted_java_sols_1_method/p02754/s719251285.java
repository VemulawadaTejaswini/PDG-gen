import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long A = sc.nextLong();
        final long B = sc.nextLong();
        long AB = A + B;
        long num = N / AB;
        long amari = N % AB;

        long sum = num * A;
        if(amari >= A)
            sum += A;
        else    
            sum += amari;
        System.out.println(sum);
    }

}
