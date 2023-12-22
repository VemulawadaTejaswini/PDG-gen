import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        String c = sc.next();
        for (int i = 0; i < 4;++i){
            k += c.charAt(i) == '+' ? 1 : -1;
        }
        System.out.println(k);
    }

}
