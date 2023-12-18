import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			double value = sc.nextDouble();
			double min_t = value/9.8;
			double just = 4.9*min_t*min_t;
			int number = (int)((just+10)/5.0);
			System.out.println(number);
		}
	}
}