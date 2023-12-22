
import java.util.Scanner;

public class Main {


      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int ans = 1;
            int modulo = 7;
            while (modulo%k !=0){
                  modulo = (modulo * 10 + 7) % k;
                  ans ++;
                  if(ans >=k+2){
                        ans = -1;
                        break;
                  }
            }
            System.out.println(ans);

      }


}
