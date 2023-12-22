import java.util.*;
public class Main{

	public static void main(String[] args) {
		int i1, i2;
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		if(i1 > i2)
			System.out.println("a > b");
		else if(i1 < i2)
			System.out.println("a < b");
		else
			System.out.println("a == b");
	}
}