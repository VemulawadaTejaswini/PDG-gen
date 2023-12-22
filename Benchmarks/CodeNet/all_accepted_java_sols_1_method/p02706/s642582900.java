import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int days = sc.nextInt();
            int work = sc.nextInt();
            int sum = 0;
            for(int i = 0; i < work; i++){
              int j = sc.nextInt();
              sum += j;
            }
            if(days - sum < 0){
              System.out.println(-1);
            } else {
              System.out.println(days - sum);
            }
            }
}