import java.util.*;

public class Main {
  public static void main(String args[]) {
  	Scanner sc = new Scanner(System.in);
    int[] group = new int[12];
    group[0] = 0;
    group[1] = 2;
    group[2] = 0;
    group[3] = 1;
    group[4] = 0;
    group[5] = 1;
    group[6] = 0;
    group[7] = 0;
    group[8] = 1;
    group[9] = 0;
    group[10] = 1;
    group[11] = 0;
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    if (group[x - 1] == group[y -1]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}