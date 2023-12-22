import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        if(n < 112) ans = 111;
        else if(n < 223) ans = 222;
        else if(n < 334) ans = 333;
        else if(n < 445) ans = 444;
        else if(n < 556) ans = 555;
        else if(n < 667) ans = 666;
        else if(n < 778) ans = 777;
        else if(n < 889) ans = 888;
        else ans = 999;
        System.out.println(ans);
    }
}