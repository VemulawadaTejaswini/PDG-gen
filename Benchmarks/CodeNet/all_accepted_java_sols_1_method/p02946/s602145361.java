import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x=sc.nextInt();
      int k=sc.nextInt();
      for (int i=k-x+1; i<k+x; i++)
      {
        System.out.print(i+" ");
      }
      System.out.println();
    }
}