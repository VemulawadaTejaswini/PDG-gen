import java.util.*;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		sc.close();
		String ans = "";
		switch(s) {
		case "Sunny":
			ans = "Cloudy";
			break;
		case "Cloudy":
			ans = "Rainy";
			break;
		default:
			ans = "Sunny"; 
		}
		out.println(ans);
	}
}
