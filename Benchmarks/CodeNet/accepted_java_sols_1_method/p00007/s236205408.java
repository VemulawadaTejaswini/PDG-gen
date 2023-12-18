import java.util.Scanner;


class Main {

	public static void main(String[] args){
		double debt = 100000;
		double rate = 1.05;

		Scanner in = new Scanner(System.in);
		int numWeeks = in.nextInt();
		
		for (int i=1; i<=numWeeks; i++){
			debt = debt * rate;
			if(debt%1000 == 0){
				//do nothing
			} else {
				debt = (debt - (debt%1000)) + 1000;
			}
		}
		System.out.println((int) debt);
	}
}