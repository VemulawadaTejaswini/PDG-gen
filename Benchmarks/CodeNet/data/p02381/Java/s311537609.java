import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n;
		double ave,d;
		while((n=scan.nextInt())!=0){
			int[] point=new int[n];
			ave=0;
			for(int i=0;i<n;i++){
				point[i]=scan.nextInt();
				ave+=point[i];
			}
			ave/=(double)n;
			d=0;
			for(int i=0;i<n;i++){
				d+=(Math.pow((ave-point[i]),2));
			}
			d/=(double)n;
			d=Math.sqrt(d);
			System.out.printf("%.8f\n",d);
		}
		scan.close();
	}
}