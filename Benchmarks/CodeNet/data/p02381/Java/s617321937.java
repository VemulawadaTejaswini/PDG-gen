import java.util.Scanner;

public class Main{

	public static double beki2(double x){
		return x*x;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int []s;
		while(true){
			n = sc.nextInt();
			if(n==0)
				break;
			s = new int[n];
			for(int i=0;i<n;i++){
				s[i]=sc.nextInt();
			}
			double ave;
			int sum=0;
			for(int i=0;i<n;i++){
				sum+=s[i];
			}
			ave = (double)sum/n;
			double vari=0;
			for(int i=0;i<n;i++){
				vari += beki2(s[i]-ave);
			}
			vari/=n;
			double dev=Math.sqrt(vari);
			System.out.println(dev);
		}
	}
}
