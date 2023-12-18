import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		int first = m/n;
		int answer=1;

		for(int i=first;i>1;i--) {
			if(m%i==0) {
				answer = i;
				break;
			}
		}

		System.out.print(answer);

	}
}
