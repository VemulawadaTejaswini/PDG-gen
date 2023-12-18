import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\n");
		int n = s.nextInt();
		for(;n>0;n--) {
			String p = s.next();
			p = p.replaceAll("Hoshino", "Hoshina");
			System.out.println(p);
		}
	}	
}