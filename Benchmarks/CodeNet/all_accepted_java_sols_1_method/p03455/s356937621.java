import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        String ans;
        ans = ((num_1 * num_2) % 2) == 0 ? "Even" : "Odd"; 
        System.out.println(ans);

    }
}
