import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();	int count = 0;
		
		while(sc.hasNext()) {
			if(sc.next().equals(word)) count++;
			if(sc.next().equals("END_OF_TEXT")) break;
		}
		
		System.out.println(count);
	}

}