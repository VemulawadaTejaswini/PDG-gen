import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        if (str.equals("Sunny")) {
            ans = "Cloudy";
        } else if (str.equals("Cloudy")) {
            ans = "Rainy";
        } else {
            ans = "Sunny";
        }
        System.out.println(ans);
    }
}
