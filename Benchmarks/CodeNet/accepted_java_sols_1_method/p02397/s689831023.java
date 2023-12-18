import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 && y == 0) break;

            if(x > y){
                System.out.println(String.format("%d %d", y, x));
            } else {
                System.out.println(String.format("%d %d", x, y));
            }


        }
    }
}

