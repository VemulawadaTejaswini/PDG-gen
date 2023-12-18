import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int a = 0;
        int b = 0;
        boolean[] success = new boolean[n];
        if(sc.nextInt() == sc.nextInt()){
        success[0] = true;
        count++;
        }
        for(int i = 1; i < n; i++) {
            if(count == 3) {
                System.out.println("Yes");
                System.exit(0);
            }
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == b && (count == 0 || success[i - 1])){
            count++;
            success[i] = true;
            }else{
                count = 0;
            }
        }
        System.out.println("No");
    }
}