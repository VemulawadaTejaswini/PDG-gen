import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num1=new int[n];
		int[] num2=new int[n];
		
		for(int t=0;t<n;t++) {
			num1[t]=sc.nextInt();
			num2[n-t-1]=num1[t];
		}
		
		for(int a=0;a<n-1;a++) {
			System.out.print(num2[a]+" ");
		}
		System.out.println(num2[n-1]);
	}
	
}



