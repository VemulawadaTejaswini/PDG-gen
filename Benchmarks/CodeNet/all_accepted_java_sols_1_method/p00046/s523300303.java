import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double min=Double.MAX_VALUE;
		double max=Double.MIN_VALUE;
		while(sc.hasNext()){
			double m=sc.nextDouble();
			if(min>m){
				min=m;
			}
			if(max<m){
				max=m;
			}
		}
		System.out.println(max-min);
	}
}