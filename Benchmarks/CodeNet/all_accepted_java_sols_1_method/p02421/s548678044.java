import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String taro, hanako, str;
        int st=0, sh=0;
        int n = scan.nextInt();
        while (n > 0) {
            taro = scan.next();
            hanako = scan.next();
            if(taro.compareTo(hanako) < 0) {
                sh += 3;
            }
            if(taro.compareTo(hanako) > 0) {
                st += 3;
            }
            if (taro.compareTo(hanako) == 0) {
                st++; sh++;
            }
            n--;
        }
        System.out.println(st + " " + sh);
    }
}