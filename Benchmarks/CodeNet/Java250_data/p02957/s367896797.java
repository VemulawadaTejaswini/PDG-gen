import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int n = scan.nextInt();
        if (l % 2 != n % 2){
            System.out.println("IMPOSSIBLE");
        }
        else {
            System.out.println(((l + n) / 2));
        }
    }
}