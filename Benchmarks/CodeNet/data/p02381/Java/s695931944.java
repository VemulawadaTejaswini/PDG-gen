import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}else{
				int sum=0;
				int[] s=new int[n];
				for(int i=0;i<n;i++){
					s[i]=sc.nextInt();
					sum+=s[i];
				}
				double m=(double)sum/(double)n;
				double a=0;
				for(int i=0;i<n;i++){
					a+=(s[i]-m)*(s[i]-m);
				}
				a=a/n;
				System.out.printf("%.8f\n",Math.sqrt(a));
			}
		}
	}
}