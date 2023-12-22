import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			double[] s=new double[n];
			double ave=0,std=0;
			for(int i=0;i<n;i++){
				s[i]=sc.nextDouble();
				ave+=s[i];
			}
			ave/=n;
			for(int i=0;i<n;i++){
				std+=Math.pow(s[i]-ave,2);
			}
			std=Math.sqrt(std/n);
			System.out.println(std);
		}
	}
}
