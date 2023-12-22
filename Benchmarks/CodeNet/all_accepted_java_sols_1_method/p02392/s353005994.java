import java.util.*;
public class Main{

	public static void main(String[] args) {
		int i1, i2, i3;
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		i3 = sc.nextInt();
		if(i1 < i2 && i2 < i3)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}