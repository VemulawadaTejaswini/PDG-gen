import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i = a; i <= b; i++) {
            if(i == c) {
                System.out.println("Yes");
                return;
            }
        }
        for(int i = b; i <= a; i++) {
            if(i == c) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
