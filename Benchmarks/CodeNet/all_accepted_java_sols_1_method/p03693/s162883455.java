import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.next() + sc.next();
        int num = Integer.parseInt(str);
        if (num % 4 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
