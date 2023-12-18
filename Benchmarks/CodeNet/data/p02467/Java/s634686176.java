import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double input = Double.parseDouble(s.nextLine());
		System.out.print((int)input + ":");
		for(int i=2 ; (int)Math.floor(Math.sqrt(input))+1 > i ;) {
			if(input%i == 0) {
				System.out.print(" " + i);
				input = input / i;
			}else
				i++;
		}
		if(input!=1)
			System.out.print(" " + (int)input);
		System.out.println("");
	}

}