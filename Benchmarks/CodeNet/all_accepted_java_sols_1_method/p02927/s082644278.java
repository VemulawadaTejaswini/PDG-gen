import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int month = sc.nextInt();
      int day = sc.nextInt();
      int count = 0;
      
      for (int i = 22; i <= day; i++) {
         String[] s = String.valueOf(i).split("");
         int day1 = Integer.parseInt(s[0]);
         int day2 = Integer.parseInt(s[1]);
         if (day1 >= 2 && day2 >= 2) {
            int ans = day1 * day2;
            for (int j = 1; j <= month; j++) {
               if (ans == j) {
                  count++;
               }
            }
         }
      }
      
      System.out.println(count);
	}
}