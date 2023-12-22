import java.math.*;
import java.text.*;
import java.lang.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for(int i=0; i<n; i++){
			String s = in.nextLine();
			System.out.println(s.replaceAll("Hoshino", "Hoshina"));
		}
	}

}