import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        String ans = "No";
        if(temp >= 30) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
