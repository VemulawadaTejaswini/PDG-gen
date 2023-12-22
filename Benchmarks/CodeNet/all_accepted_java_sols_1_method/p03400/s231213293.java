import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int d=stdin.nextInt();
		int x=stdin.nextInt();
		int a[]=new int[n];
		int i,j;
		int sum=0;
		for(i=0;i<n;i++)
			a[i]=stdin.nextInt();

		for(i=0;i<n;i++){
			int temp=1;
			while(temp<=d){
				temp+=a[i];
				sum++;
			}
		}
		sum+=x;
		System.out.println(sum);
	}
}