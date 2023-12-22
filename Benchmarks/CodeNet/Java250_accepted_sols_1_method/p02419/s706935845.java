import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final String word = sc.next();
		
		int count = 0;
		while(true){
			final String txt = sc.next();
			
			if("END_OF_TEXT".equals(txt)){
				break;
			}else if(word.equalsIgnoreCase(txt)){
				count++;
			}
		}
		
		System.out.println(count);
	}

}