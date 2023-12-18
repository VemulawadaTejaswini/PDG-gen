import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		final String EOT = "END_OF_TEXT";
		String w, t;
		int count = 0;
		
		w = sc.next();
		while(true){
			t = sc.next();
			
			if(t.equals(EOT)){
				break;
			}
			
			if(t.equalsIgnoreCase(w)){
				count ++;
			}
		}
		
		System.out.println(count);
	}
}