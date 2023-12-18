import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x * 2 <= y) && (y <= x * 4) && (x <= 100) && (y <= 100)) {
		System.out.println("Yes");
		return;
		}else{
		System.out.println("No");
		return;
		}
    }
}