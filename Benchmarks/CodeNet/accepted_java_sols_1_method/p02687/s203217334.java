import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
		String ans = "ABC";

		if (N.equals("ABC")) {
			ans = "ARC";
		}

		System.out.println(ans);

        sc.close();
    }    
}
