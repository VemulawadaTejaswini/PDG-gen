import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int at = 0;
        int bt = 1;
        int ans = 1;
        for (int i = 1; i<1000; i++){
            at = at+i;
            bt = bt + i + 1;
            if ((at-a)==(bt-b)){
                ans = at-a;
                break;
            }
        }

        System.out.println(ans);
    }
}