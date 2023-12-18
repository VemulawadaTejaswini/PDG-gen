import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int r = Integer.parseInt(line);

        double result = Math.pow(r, 2) / 1;
        System.out.println(((int)result));

        sc.close();
	}
}