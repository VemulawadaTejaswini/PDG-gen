import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double gyou = sc.nextDouble();
		double retu = sc.nextDouble();
		double num = sc.nextDouble();
		if(num / gyou < num / retu){
			System.out.print(String.format("%.0f",Math.ceil(num / gyou)));
		}else{
			System.out.print(String.format("%.0f",Math.ceil(num / retu)));
		}
	}
}