import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans1 = 0;
        if(a > b){
            ans1 = b;
        } else {
            ans1 = a;
        }
        int ans2 = (a + b) - x;
        if(ans2 < 0){
            ans2 = 0;
        }
        System.out.println(ans1 + " " + ans2);
    }
}
