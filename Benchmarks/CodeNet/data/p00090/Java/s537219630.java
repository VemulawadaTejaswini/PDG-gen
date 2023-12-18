import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,count,max;
		double a,b,c,x1,y1;;
		while(true){
			count=0;
			n=sc.nextInt();
			if(n==0) break;
			double x[]=new double[n];
			double y[]=new double[n];
			for(i=0;i<n;i++){
				String str[]=sc.next().split(",");
				x[i]=Double.parseDouble(str[0]);
				y[i]=Double.parseDouble(str[1]);
			}
			max=1;
			for(i=0;i<n;i++){
				count=0;
				for(j=0;j<n;j++){
					x1=x[i]-x[j];
					y1=y[i]-y[j];
					a=x1*x1;
					b=y1*y1;
					c=Math.sqrt(a+b);
					if(c<=2.0000000000000000000000000000000000000000) count++;
				}
				if(max<count) max=count;
			}//for
			System.out.println(max);
		}//
	}
}