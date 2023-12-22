import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(13 <= a) System.out.println(b);
        else if(a < 6) System.out.println(0);
        else System.out.println(b/2);
        sc.close();

    }

}
