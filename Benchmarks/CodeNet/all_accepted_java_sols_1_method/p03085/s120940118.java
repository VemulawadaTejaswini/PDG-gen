import java.util.*;
public class Main {
	public static void main(String[] args){
		// get numbers
		Scanner sc = new Scanner(System.in);        
		String b = sc.next();
        String ans = "";

        if (b.equals("A")) {
            ans = "T";
        } else if (b.equals("T")) {
            ans = "A";
        } else if (b.equals("C")) {
            ans = "G";
        } else {
            ans = "C";
        }

		// output
        System.out.println(ans);
        sc.close();
	}
}