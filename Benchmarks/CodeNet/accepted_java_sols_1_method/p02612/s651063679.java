import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int res = 1000 - n % 1000;
        if(res == 1000)
            res = 0;
        System.out.println(res);
    }
}