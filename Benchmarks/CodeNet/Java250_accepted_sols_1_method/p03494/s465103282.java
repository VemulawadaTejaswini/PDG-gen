import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 800;
		for (int i=0;i<N;i++) {
			long a = sc.nextLong();
			int temp=0;
			while (a%2==0) {
				a/=2;
				temp++;
			}
			if (temp<count) {
				count = temp;
			}
		}
		System.out.println(count);
	}
}