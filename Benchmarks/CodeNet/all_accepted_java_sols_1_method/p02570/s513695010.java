import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int d = sc.nextInt();
	int t = sc.nextInt();
	int s = sc.nextInt();
	if (d <= t * s) System.out.print("Yes");
	else { System.out.print("No"); }
    }
}
