import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) break;

            for(int i=0; i<a; i++){
                for(int j=0; j<b; j++){
                    if(i == 0 || j == 0 || j == b-1 || i == a-1){
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

