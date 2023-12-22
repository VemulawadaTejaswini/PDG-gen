import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            if(length<=d) {
                count ++;
            }
        }
        System.out.println(count);
    }
}