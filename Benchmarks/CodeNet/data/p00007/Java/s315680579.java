import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//??????10??????
		int debt = 100000;

		//n??±???
		int n = scanner.nextInt();

		for(int i=0; i<n; i++){
			debt *= 1.05;
		}
		System.out.println(roundOff(debt));
	}

	public static int roundOff(int debt){
		String strDebt = String.valueOf(debt);
		int splitDebt = Integer.parseInt(strDebt.substring(strDebt.length()-4));
		if(0<splitDebt){
			debt = (debt+10000) - splitDebt;
		}
		return debt;
	}

}