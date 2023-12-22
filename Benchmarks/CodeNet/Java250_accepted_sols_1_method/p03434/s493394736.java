import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = 0;
      int b = 0;
      int[] socres = new int[n];
      for(int i = 0 ; i < n ; i++) {
        	socres[i] = sc.nextInt();
      }
      Arrays.sort(socres);
      int i = n - 1;
      while(i >= 0) {
        a += socres[i--];
        if(i >= 0)
         	b += socres[i--];
      }
      System.out.println(a - b);
  }
}