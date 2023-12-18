import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		String line = sc.nextLine();
		String[] word = line.split(" ",0);
      for(int i = 0; i < Integer.parseInt(num); i++){
        	System.out.print(word[0].charAt(i));
        	System.out.print(word[1].charAt(i));
        }
	}
}