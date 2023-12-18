import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		String inputs = sc.next();
		String[] input = inputs.split("");
		String output = "";
		for(int i=0;i<n;i++) {
			if(i == k-1) {
				output = output + input[i].toLowerCase();
			}else {
				output = output + input[i];
			}
		}
		System.out.println(output);
	}
}
