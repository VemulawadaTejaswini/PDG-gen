import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        String res = (a * b) % 2 == 0 ? "Even" : "Odd";
        System.out.println(res);
    }

}
