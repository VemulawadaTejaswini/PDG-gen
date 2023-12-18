import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.next());
        int cost = Integer.parseInt(sc.next());
      if (age <= 5) {
        System.out.println(0);
    } else if (age <= 12) {
        System.out.println(cost/2);
    } else {
    	System.out.println(cost);
    }
  }
}