import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zankin = sc.nextInt();
        int i = 0;
        int j = 0;
      
      while (zankin - 500 * (i + 1) >= 0 ) {
        i = i + 1 ;
      }
      zankin = zankin - 500 * i ;
      
      while (zankin - 5 * (j + 1) >= 0 ) {
        j = j + 1 ;
      }
      
      System.out.println(i * 1000 + j * 5);

    }
}

