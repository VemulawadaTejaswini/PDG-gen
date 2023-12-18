import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = "Good";
        for (int i = 0; i < 3; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                ans = "Bad";
                break;
            }
        }
        System.out.println(ans);
    }
}
