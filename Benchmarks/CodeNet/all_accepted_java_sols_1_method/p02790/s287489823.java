import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "";
        for (int i = 0; i < Math.max(a,b); i++) {
            result += Math.min(a,b);
        }
        System.out.println(result);
    }
}