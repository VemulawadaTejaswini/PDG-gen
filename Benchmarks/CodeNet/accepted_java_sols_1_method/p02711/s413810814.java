import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        String ans = "No";

        n = sc.nextInt();
        
        if((n % 10 == 7) || ((n % 100 >= 70) && (n % 100 <= 79)) || ((n % 1000 >= 700) && (n % 1000 <= 799))){
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}
