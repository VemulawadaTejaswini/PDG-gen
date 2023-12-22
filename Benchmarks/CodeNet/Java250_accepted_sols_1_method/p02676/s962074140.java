import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        String str = sc.next();
        sc.close();
        String result;

        if(str.length()>lim) {
            result = str.substring(0,lim);
            System.out.println(result+"...");
        } else {
            result = str;
            System.out.println(result);
        }


    }
}