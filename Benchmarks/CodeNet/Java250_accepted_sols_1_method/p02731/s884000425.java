import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
        String input_line = sc.nextLine();
        double L=Double.parseDouble(input_line);
        System.out.print(Math.pow(L/3.0, 3.0));
	}
 
}