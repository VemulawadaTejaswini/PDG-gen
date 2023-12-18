// 173 a
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = n%1000;
        if (ans == 0){
            System.out.println(ans);
        } else {
            System.out.println(1000-ans);
        }
    }
}