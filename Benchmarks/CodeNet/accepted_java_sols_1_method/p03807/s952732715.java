import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int o = 0;
        for (int i = 0;i < n;i++) {
            if (sc.nextInt()%2==1) o++;
        }
        
        if (o%2==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
