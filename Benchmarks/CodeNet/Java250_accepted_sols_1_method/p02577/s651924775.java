import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int total = 0;
        //分解して足し算
        for(int i=0; i < n.length(); i++) {
            int num = Character.getNumericValue(n.charAt(i));
            total += num;
        }
        //判断
        if (total%9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}