import java.util.Arrays;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hoge = Integer.parseInt(sc.next());
        int fuga= Integer.parseInt(sc.next());
        sc.close();
        System.out.println(Math.max(hoge+fuga, Math.max(hoge-fuga, hoge*fuga)));
    }
}