import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = Integer.parseInt(s.nextLine());
		System.out.print(input + ":");
		for(int i=2 ; input > 1 ;) {
			if(input%i == 0) {
				System.out.print(" " + i);
				input = input / i;
			}else
				i++;
		}
	}

}