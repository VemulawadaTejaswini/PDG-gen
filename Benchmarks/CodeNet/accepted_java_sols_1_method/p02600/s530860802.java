import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans = 0;
        if (400 <= X && X < 600) {
            ans = 8;
        } else if (600 <= X && X < 800){
            ans = 7;
        } else if (800 <= X && X < 1000){
            ans = 6;
        } else if (1000 <= X && X < 1200){
            ans = 5;
        } else if (1200 <= X && X < 1400){
            ans = 4;
        } else if (1400 <= X && X < 1600){
            ans = 3;
        } else if (1600 <= X && X < 1800){
            ans = 2;
        } else if (1800 <= X && X < 2000){
            ans = 1;
        }
        System.out.println(ans);
    }
}
