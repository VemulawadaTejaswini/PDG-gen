import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  String[] forecast = sc.nextLine().split("");
      String[] ans = sc.nextLine().split("");
      int count = 0;
	  for (int i = 0; i < 3; i++) {
        if (forecast[i].equals(ans[i])) {
          count++;
        }
      }

      System.out.println(count);
    }
}