
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int count = 0;
		while(true){
			String s = sc.next();
			if(s.equals("END_OF_TEXT")){
				break;
			}
			if(w.toLowerCase().equals(s.toLowerCase())){
				count++;
			}
		}
		System.out.println(count);
	}
}

