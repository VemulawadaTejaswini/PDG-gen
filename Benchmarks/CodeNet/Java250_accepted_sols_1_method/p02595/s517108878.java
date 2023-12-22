import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double D = sc.nextDouble();
		int count=0;
		for(int i=0;i<N;i++){
		    double x = sc.nextDouble();
		    double y = sc.nextDouble();
		    if(D>=Math.sqrt(x*x +y*y)){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
