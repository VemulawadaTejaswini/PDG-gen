import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long []a=new long [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		int count_g=0;
		int count_k=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==0)count_g++;
			else count_k++;
		}
		if(count_k%2==0)System.out.println("YES");
		else System.out.println("NO");
	}
}
