import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;){
			String a = s.next();
			String b = a.toUpperCase();
			System.out.print(b);
			if(s.hasNext())
				System.out.print(" ");
			else
				break;
		}
    }
}