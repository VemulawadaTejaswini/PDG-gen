import java.util.Scanner;

class Range {
	
	private boolean getRange(int n1, int n2, int n3) {
		return (n1 < n2) ? (n2 < n3 ? true : false) : false; 
	}
	
	public String compare(int n1, int n2, int n3) {
		if (getRange(n1, n2, n3)) {
			return "Yes";
		}
		return "No";
	}
}

public class Main {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = new Range().compare(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(result);

	}

}
