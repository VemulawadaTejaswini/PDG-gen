import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] temp = sc.nextLine().split(",");
			double BMI = Double.parseDouble(temp[1]) / Math.pow(Double.parseDouble(temp[2]), 2);
			if(BMI >= 25) System.out.println(temp[0]);
		}
	}
}