import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ASC = 96;
		List<Character> name = new ArrayList<>();
     
        while (N > 0) {
			if (N%26==0)
			{name.add('z');}
		else {name.add((char)((N%26)+96));}
			N = (N-1)/26;
            }
        Collections.reverse(name);
      
      StringBuilder str = new StringBuilder();
    for (Character character : name){
        str.append(character);
    }

			
		System.out.println(str.toString());
        }
		
}