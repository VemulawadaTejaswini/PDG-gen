import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int AC = 0, WA = 0, TLE = 0, RE = 0;
    for (int i=0; i<N; i++) {
        String num = sc.next();
    	switch (num) {
          case "AC": AC += 1;
            break;
          case "WA": WA += 1;
            break;
          case "TLE": TLE += 1;
            break;
          case "RE": RE += 1;
            break;
        }
    }
    int[] ans = {AC,WA,TLE,RE};
    String[] array = {"AC","WA","TLE","RE"};
    for (int i=0; i<4; i++) {
        System.out.println(array[i]+" x "+ans[i]);
    }
  }
}