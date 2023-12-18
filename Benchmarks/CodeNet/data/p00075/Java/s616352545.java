
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] line = sc.nextLine().split(",");
			int num = Integer.parseInt(line[0]);
			double weight = Double.parseDouble(line[1]);
			double height = Double.parseDouble(line[2]);
			double bmi = weight / (height*height);
			if(bmi >= 25){
				System.out.println(num);
			}
		}
	}
}