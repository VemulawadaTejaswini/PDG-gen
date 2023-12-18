import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int rangeA = Math.abs(X - A);
		int rangeB = Math.abs(X - B);
		
		if (rangeA < rangeB) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
