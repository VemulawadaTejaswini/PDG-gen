import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long max = (long)Math.pow(10, 18);
        long total = 1;
        for(int i = 0; i < num; i++){
          long n = sc.nextLong();
          if(String.valueOf(total).length()+String.valueOf(total).length()-1>19){
            total = -1;
            break;
          }
          total *= n;
          if(total>max){
            total = -1;
            break;
          }

        }
        System.out.println(total);
    }
}
