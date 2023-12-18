import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int count = 0;
		String W = scan.next();
		for(;;){
			String T = scan.next();
			if(T.equals("END_OF_TEXT")){
				break;
			}
			String w = W.toLowerCase();
			String t = T.toLowerCase();
			if(t.equals(w)){
				count++;
			}
		}
		System.out.println(count);
	}
}