
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("[\\s.]+");
		int count = 0;
		String word = sc.next();
		while(true){
			String in = sc.next();
			if(in.equals("END_OF_TEXT")){
				break;
			}
			if(in.equals(word)){
				count++;
			}
		}
		System.out.println(count);
	}
}