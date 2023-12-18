import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] len=new int[n];
		
		for(int i=0;i<n;i++) {
			len[i]=sc.nextInt();
		}
		
		int a=0;
		int b=0;
		int c=0;
		
		int count=0;
		
		for(int i=0;i<n-2;i++) {
			a=len[i];
			for(int k=i+1;k<n-1;k++) {
				b=len[k];
				for(int l=k+1;l<n;l++) {
					c=len[k];
					
					if(a+b>=c && b+c<=a && c+a>=b) {
						count++;
						
					}
				}
			}
			System.out.println(count);
		}
		
		
		
		
	}

}
