import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		String x = sc.nextLine();
		char[] line = x.toCharArray();

		for(int i=0;i<x.length();i++) {
			if(Character.isUpperCase(line[i])) {
				line[i] = Character.toLowerCase(line[i]);
			}else if(Character.isLowerCase(line[i])) {
				line[i] = Character.toUpperCase(line[i]);
			}
			System.out.print(line[i]);
		}
		System.out.println();
		sc.close();
	}
}
