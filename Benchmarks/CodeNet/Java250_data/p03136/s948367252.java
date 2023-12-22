import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			l[i]=scan.nextInt();
			sum+=l[i];
		}
		scan.close();
		boolean tf=true;
		for(int i=0;i<n;i++) {
			if(l[i]>= sum-l[i]) {
				tf=false;
				break;
			}
		}
		System.out.println((tf)? "Yes":"No");
	}
}