import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	long N=sc.nextLong();
	long min=N;
	for(long i=(long) Math.floor(Math.sqrt(N));i>=1;i--) {
		if(N%i==0) {
			min=i+N/i-2;
			break;
		}
	}
	System.out.println(min);
}
}