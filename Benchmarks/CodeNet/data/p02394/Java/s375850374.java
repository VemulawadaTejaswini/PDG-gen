import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if ((x-r) >= 0 && (x+r) <= W && (y+r)<= H && (y-r)>=0 ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

