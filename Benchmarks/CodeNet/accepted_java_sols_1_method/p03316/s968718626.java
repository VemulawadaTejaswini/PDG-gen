import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        int s = 0;
        for (int i = 0;i < k.length();++i){
            s += Integer.valueOf(k.charAt(i) + "");
        }
        System.out.println(Integer.valueOf(k) % s == 0 ? "Yes" : "No");
    }

}
