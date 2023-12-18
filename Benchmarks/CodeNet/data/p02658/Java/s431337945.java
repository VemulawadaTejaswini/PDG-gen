import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long total = 1;
        long[] hairetu = new long[num];
        for(int i = 0; i < num; i++){
          hairetu[i] = Long.parseLong(sc.next());
          if(hairetu[i] == 0)
            total = 0;
        }
        if(total != 0){
          for(int i = 0; i < num; i++){
            total *= hairetu[i];
            if(total > Long.parseLong("1000000000000000000")){
              total = -1;
              break;
            }
          }
        }
        System.out.println(total);
    }
}

