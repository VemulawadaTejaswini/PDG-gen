import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args) {
		try{
			Scanner s1 = new Scanner(System.in);
			double h = s1.nextInt();
			double a = s1.nextInt();
			double c = Math.ceil(h/a);
			int d = (int)c;
			System.out.println(d);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}