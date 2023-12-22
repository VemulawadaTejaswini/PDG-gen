import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] list = new int[5];
    for (int i=0; i<list.length; i++) {
      list[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    
    int max = 0;
    for (int i=0; i<list.length; i++) {
      for (int j=i+1; j<list.length; j++) {
        max = Math.max(max, list[j]-list[i]);
      }
    }
    
    if (max > k) {
      System.out.println(":(");
    }
    else {
      System.out.println("Yay!");
    }
  }
}