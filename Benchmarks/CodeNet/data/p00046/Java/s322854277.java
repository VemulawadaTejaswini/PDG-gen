import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = -1;
		double min = 999999;
		while(sc.hasNext()){
			double num = sc.nextDouble();
			if(max < num) max = num;
			if(min > num) min = num;
		}
		System.out.println(max - min);
	}
}