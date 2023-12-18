import java.util.*;

public class Main{
	public static void main(String[] args){
		
		int i = 1;
		Scanner s = new Scanner (System.in);
		
		while (true) {
			int x = s.nextInt();
			
			if (x == 0){
				break;
			}
			System.out.println("Case "+ i + ": " + x);
			i++;
		}
	}
}