import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k[]=new int[n];
		int a[]=new int[m];
		
		for(int i=0;i<m;i++) {
			a[i]=0;
		}
		
		for(int i=0;i<n;i++) {
			k[i]=s.nextInt();
			for(int ii=0;ii<k[i];ii++) {
				a[s.nextInt()-1]++;
			}
			
		}
		
		int count =0;
		for(int i=0;i<m;i++) {
			if(a[i]==n){
				count++;
				}
			}
		
		
		System.out.println(count);
		s.close();
	}

}
