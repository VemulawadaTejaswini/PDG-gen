import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		int sumRight=0;
		int sumLeft=0;
		int[] marr = new int[101];
		for(int i=0;i<m;i++) {
			marr[sc.nextInt()]=1;
		}
		for(int i=x;i<n;i++) {
			sumRight+=marr[i];
}
		for(int i=x;i>=0;i--) {
			sumLeft+=marr[i];
		}
		
		if(sumRight>sumLeft) System.out.println(sumLeft);
		else System.out.println(sumRight);
	}
}
