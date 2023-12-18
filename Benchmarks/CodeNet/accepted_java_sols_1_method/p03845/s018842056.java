import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0,a=0;
		int[] t=new int[n];
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
			sum+=t[i];
		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			a=t[sc.nextInt()-1]-sc.nextInt();
			System.out.println(sum-a);
		}
		sc.close();
	}
}