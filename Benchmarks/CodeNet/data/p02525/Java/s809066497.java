import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i;
		double s[]=new double[1000];
		double n,m,a,sum=0,sig=0,answer;
		while((n=sc.nextInt())!=0){
			for(i=0;i<=n-1;i++){
				s[i]=sc.nextInt();
				sum+=s[i];
			}
			m=sum/n;
			for(i=0;i<=n-1;i++){
				sig=sig+(s[i]-m)*(s[i]-m);
			}
			a=sig/n;
			answer=Math.sqrt(a);
			System.out.println(String.format("%.8f",answer));
		}
	}