
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        int i = 1;
        int j = 0;
        while(i != 0){
            j++;
            i =  sc.nextInt();
        }
        sc.close();
        System.out.println(j);
    }
}
