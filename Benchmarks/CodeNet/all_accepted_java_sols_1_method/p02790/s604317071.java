import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        String ans = "";
        for(int i=0; i<max; i++) {
            ans += String.valueOf(min);
        }
        
        System.out.println(ans);
    }
}
