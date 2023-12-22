import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        String g = sc.next();
        String b = sc.next();

        int number = Integer.parseInt(r + g + b);

        if (number % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}
}