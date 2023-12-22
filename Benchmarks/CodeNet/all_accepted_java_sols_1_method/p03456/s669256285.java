import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine().replace(" ", ""));
		if ((int)(Math.sqrt(x)) * (int)(Math.sqrt(x)) == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}