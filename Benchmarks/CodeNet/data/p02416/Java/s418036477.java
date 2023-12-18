import java.util.Scanner;

public class Main{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String line;
		line = sc.nextLine();
		int sum = 0;
		int i;

		while(line.compareTo("0") != 0){
			for(i = 0;i < line.length();i++){
				sum += Character.getNumericValue(line.charAt(i));
			}
			System.out.println(sum);
			line = sc.nextLine();
			sum = 0;
		}

	}
}
