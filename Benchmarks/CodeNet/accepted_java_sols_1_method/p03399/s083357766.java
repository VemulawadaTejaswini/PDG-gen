import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int goal=2001;
		int a[] = new int[2];
		int b[]=new int[2];
		for(int i=0;i<2;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				int num =a[i] + b[j];
				if(goal>num) {
					goal=num;
				}
			}
		}
		System.out.println(goal);
	}
}