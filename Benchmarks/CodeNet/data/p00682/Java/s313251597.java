import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,seq=1;
		double area;
		while(true){
			n=sc.nextInt();
			if(n!=0){
				area=0.0;
				int[] x=new int[n],y=new int[n];
				for(int i=0;i<n;i++){
					x[i]=sc.nextInt();
					y[i]=sc.nextInt();
				}
				for(int i=0;i<n-1;i++){
					area+=(y[i]*x[i+1]-x[i]*y[i+1]);
				}
				area+=(y[n-1]*x[0]-x[n-1]*y[0]);
				area/=2.0;
				System.out.printf("%d %.1f\n",seq++,area);
			}
			else{
				break;
			}
		}
	}
}
