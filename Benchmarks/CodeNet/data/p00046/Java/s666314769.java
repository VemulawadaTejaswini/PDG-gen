import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double max,min;
		max = min = scan.nextDouble();
		while(scan.hasNext()){
			double t = scan.nextDouble();
			if(max < t){
				max = t;
			}else if(min > t){
				min = t;
			}
		}
		System.out.println(max-min);
	}
}