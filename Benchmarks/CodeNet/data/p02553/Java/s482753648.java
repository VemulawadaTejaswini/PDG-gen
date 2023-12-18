import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int w = d * b;
        int x = c * b;
        int y = a * c;
        int z = a * d;
        
        int ans = Math.max(Math.max(w, x), Math.max(y, z));
        System.out.println(ans);

    }
}