import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int ans =  v / 2;
        if (v % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }
}
