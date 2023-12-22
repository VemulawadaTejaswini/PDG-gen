import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] menu = new int[5];
    for (int i=0; i<menu.length; i++) {
      menu[i] = sc.nextInt();
    }
    
    int max = 0;
    int flag = 0;
    for (int i=0; i<menu.length; i++) {
      int tmp = (int)(Math.ceil((double)menu[i]/10)*10);
      if (max < tmp-menu[i]) {
        flag = i;
        max = tmp-menu[i];
      }
    }
    
    int time = 0;
    for (int i=0; i<menu.length; i++) {
      if (i==flag) continue;
      
      time += (int)(Math.ceil((double)menu[i]/10)*10);
    }
    
    time += menu[flag];
    
    System.out.println(time);
  }
}
