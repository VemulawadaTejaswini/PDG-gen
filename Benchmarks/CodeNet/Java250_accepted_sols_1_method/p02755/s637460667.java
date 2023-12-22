import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int ans = -1;
        for (int i = 1; i <= 1000; i ++){
            if ((int)Math.floor(i * 0.08) == a && (int)Math.floor(i * 0.1) == b){
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
}
