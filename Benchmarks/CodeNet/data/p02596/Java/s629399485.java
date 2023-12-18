import java.util.Scanner;

public class Main {


      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n%2 == 0){
                  System.out.println(-1);
                  System.exit(0);

            }            int ans = 1;
            int modulo = 7;
            while(modulo%n != 0){
                  modulo = (modulo *10 + 7)%n;
                  ans++;

            }
            System.out.println(ans);

      }


}
