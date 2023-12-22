import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
      
        // 5 7 5
        // 5 5 7
        // 7 5 5
      
        if (x == 5 && y == 7 && z == 5) {
            System.out.println("YES");
        } else if (x == 5 && y == 5 && z == 7) {
            System.out.println("YES");
        } else if (x == 7 && y == 5 && z == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}