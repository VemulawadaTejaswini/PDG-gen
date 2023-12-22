import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = Integer.parseInt(str.substring(0,1));
        int b = Integer.parseInt(str.substring(1,2));
        int c = Integer.parseInt(str.substring(2,3));
        System.out.println(a+b+c);
    }
}
