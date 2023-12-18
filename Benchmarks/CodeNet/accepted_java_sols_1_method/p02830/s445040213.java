import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String [] str = sc.next().split("");
            String [] str2 = sc.next().split("");
            for(int i = 0; i < N; i++){
              System.out.print(str[i]);
              System.out.print(str2[i]);
            }
            }
}