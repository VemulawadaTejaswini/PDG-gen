import java.util.*;
public class Main{
	public static void main(String[] a)throws java.io.IOException{
	Scanner scan=new Scanner(System.in);
	while(true){
		int q=scan.nextInt();
		if(q==-1)break;
		double x =q/2;
		while(Math.abs(Math.pow(x,3)-q)>=q*0.00001){
			x =x-(Math.pow(x, 3)-q)/(3*Math.pow(x, 2));
		}
		System.out.printf("%1.6f\n",x);

	}
	}
}