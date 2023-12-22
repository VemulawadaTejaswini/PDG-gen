import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W=sc.nextInt();
		int H=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int count=0;
		double res=(double)W*(double)H/2;
		if(2*x==W && 2*y==H) count=1;
		
		System.out.println(String.format("%.6f", res)+" "+count);
	}

}
