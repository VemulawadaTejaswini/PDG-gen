import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum,i;
		double m,alpha;
		while(true){
			sum=0;
			alpha=0;
			int n = sc.nextInt();
			if(n==0)break;
			int s[] = new int[n];
			for(i=0;i<n;i++){
				s[i]=sc.nextInt();
				sum+=s[i];
			}
			m = (double)sum/n;
			for(i=0;i<n;i++){
				alpha+=Math.pow(s[i]-m,2);
			}
			alpha/=n;
			alpha=Math.sqrt(alpha);
			System.out.println(alpha);
		}
	}
}

