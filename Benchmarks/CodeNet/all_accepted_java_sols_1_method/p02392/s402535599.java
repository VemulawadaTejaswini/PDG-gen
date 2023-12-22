import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int small = sc.nextInt();
        int medium = sc.nextInt();
        int large = sc.nextInt();
        String ans = "";
        if(small < medium && medium < large) {
            ans = "Yes";
        } else {
            ans = "No";
        }
        System.out.println(ans);
        sc.close();
    }
}
