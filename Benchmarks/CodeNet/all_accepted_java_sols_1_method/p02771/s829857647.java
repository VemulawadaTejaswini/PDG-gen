import java.util.*;
 
public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int L = sc.nextInt();
            if((N == M || M == L || N == L) && !(N == M && N == L)){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
          }
}