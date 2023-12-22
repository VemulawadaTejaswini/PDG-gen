import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
		String result;
		if (A == B && A != C || A == C && A != B || B == C && A != B) {
			result = "かわいそう";
		} else {
			result = "";
		}
		if (result == "かわいそう") {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}