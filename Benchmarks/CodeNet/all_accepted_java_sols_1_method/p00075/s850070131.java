import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] str = scan.nextLine().split(",");
			double[] student = new double[str.length];
			for(int i = 0;i < str.length;i++){
				student[i] = Double.parseDouble(str[i]);
			}
			double bmi = student[1] / (student[2]*student[2]);
			if(bmi >= 25){
				System.out.println((int)student[0]);
			}
		}
	}
}