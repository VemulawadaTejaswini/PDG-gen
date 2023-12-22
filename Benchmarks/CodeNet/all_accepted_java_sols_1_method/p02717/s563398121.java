import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int tmp;
        tmp = x;
        x = y;
        y = tmp;
        tmp = x;
        x = z;
        z = tmp;
        System.out.println(x+" "+y+" "+z);
	}
}