import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String Base = s.next();
		if (Base.equals("A")){
			System.out.println("T");
		}
		else if (Base.equals("T")){
			System.out.println("A");
		}
		else if (Base.equals("G")){
			System.out.println("C");
		}
		else System.out.println("G");
	}
}
