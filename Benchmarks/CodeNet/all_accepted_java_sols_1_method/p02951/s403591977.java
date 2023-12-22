import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = sc.nextInt() + sc.nextInt() - a;
        System.out.println(Math.max(res, 0));
    }
}