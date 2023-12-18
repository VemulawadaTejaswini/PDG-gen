import java.util.*;

public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        sc.close();

        if (d / s <= t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } 
      }
}