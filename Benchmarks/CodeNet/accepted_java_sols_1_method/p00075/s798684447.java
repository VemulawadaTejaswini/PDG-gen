import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		 Scanner stdin = new Scanner(System.in);
		while(stdin.hasNext()){
	        String[] human = stdin.nextLine().split(",");
	        double weight = Double.parseDouble(human[1]);
	        double height = Double.parseDouble(human[2]);
	        double bmi = (weight/(Math.pow(height, 2)));
	        if(bmi>=25)
	        System.out.println(human[0]);
	    }

		}
	}