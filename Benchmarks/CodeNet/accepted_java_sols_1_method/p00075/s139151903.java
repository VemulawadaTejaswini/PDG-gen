import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//??????????????°
		double bmi;
		String [][] kiroku = new String[50][3];
		double [][] date = new double[50][3];

		//????????£????????????
		Scanner scan = new Scanner(System.in);

		//BMI??????
		int i = 0;
		int j=0;

		//????????????
		while(scan.hasNext()){
		//?¨??????????
				String str = scan.next();
				kiroku[i] = str.split(",");
				date [i][1]= Double.parseDouble(kiroku[i][1]);
				date [i][2]= Double.parseDouble(kiroku[i][2]);
			i++;

		}
		for(int x = 0 ; x < date.length ; x++){
			bmi = date[x][1] / (date[x][2] * date[x][2]);
			if(bmi >= 25){
				System.out.println(kiroku[x][0]);
			}
		}
	}
}