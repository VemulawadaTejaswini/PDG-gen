import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long c=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
			while(a[i]%2==0) {
				c++;
				a[i]=a[i]/2;
			}
		}
		System.out.println(c);
	
	
	
	
	}
	
}



