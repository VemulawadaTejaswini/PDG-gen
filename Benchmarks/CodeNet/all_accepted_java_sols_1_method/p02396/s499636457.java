import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 1;
        while(true){
            int x = sc.nextInt();
            if(x == 0) break;
            System.out.println("Case " + index + ": " + x);
            index++;
        }
        sc.close();
    }
}
