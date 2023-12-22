import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count=0; String w, t; 
		
		w = in.next();
		
		while(true){
			t = in.next();
			if(t.equals("END_OF_TEXT")) break;
			if(t.toLowerCase().compareTo(w) == 0) count++;
		}
		
		System.out.println(count);
	}
}