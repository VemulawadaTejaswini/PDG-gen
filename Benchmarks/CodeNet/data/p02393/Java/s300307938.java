import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int[] x=new int[3];
		int s=0;
		while (s<=2){
			x[s]=i.nextInt();
			s++;}
		int n=0;
		while (n<=1){
			int m=n+1;
			while (m<=2){
				if (x[n]>x[m]){s=x[n];x[n]=x[m];x[m]=s;}
				m++;}
			n++;}
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
	}
}