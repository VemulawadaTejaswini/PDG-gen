import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		
		for(int i=0; i < t.length(); i++){
			char c =	t.charAt(i);
			if(Character.isUpperCase(c)){
				c = Character.toLowerCase(c);
			}
			else if (Character.isLowerCase(c)) {
		        c = Character.toUpperCase(c);
		      }
		      System.out.print(c);
		}
		 System.out.println();
	}

}