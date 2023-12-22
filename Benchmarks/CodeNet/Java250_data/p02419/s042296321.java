import java.util.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String W = scanner.next();
		int count = 0;
		while(true){
			String T = scanner.next();
			if(T.equals("END_OF_TEXT"))
				break;
			T = T.toLowerCase();
			if(W.equals(T))
				count ++;
		}
		System.out.println(count);
	}
}

