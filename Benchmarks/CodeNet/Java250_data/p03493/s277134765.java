import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String onlyOne = line.replaceAll("0", "");
        System.out.println(onlyOne.length());
        
        sc.close();
	}
	
}