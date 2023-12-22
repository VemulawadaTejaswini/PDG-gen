import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		long[] a=new long [5];
		for(int i=0;i<n;i++) {
			s=sc.next();
			if(s.charAt(0)=='M'){
				a[0]++;
			}
			else if(s.charAt(0)=='A'){
				a[1]++;
			}
			else if(s.charAt(0)=='R'){
				a[2]++;
			}
			else if(s.charAt(0)=='C'){
				a[3]++;
			}
			else if(s.charAt(0)=='H'){
				a[4]++;
			}

		}
		long ans=0;
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<4;j++) {
				for(int k=j+1;k<5;k++) {
					ans+=a[i]*a[j]*a[k];
				}
			}
		}
		System.out.println(ans);
		
	
	}
}
