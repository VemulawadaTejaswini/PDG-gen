import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		for(int i = 2 ; i < str.length(); i+=2){
			if(str.substring(0,(str.length()-i)/2).equals(str.substring((str.length()-i)/2,str.length()-i))){
				System.out.println(str.length()-i);
				return;
			}
		}
	}
}