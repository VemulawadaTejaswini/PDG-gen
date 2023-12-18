import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 1;
    int min = 1000000000;
    int N = sc.nextInt();
    while (sc.hasNext()){ 
        int val = sc.nextInt();
        max = Math.max(max,val);
        min = Math.min(min,val);
    }
    System.out.println(Math.abs(max-min));
  }
}