import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
		long count = 0;
		if((b-a)%2!=0) {
			if(a-1<=n-b) {
				count += a;
				count += (b-a-1)/2;
				System.out.println(count);
			}else{
				count += n-b+1;
				count += (b-a-1)/2;
				System.out.println(count);
			}
		}else {
			System.out.println((b-a)/2);
		}
	}
}


