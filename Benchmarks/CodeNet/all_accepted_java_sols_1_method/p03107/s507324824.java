import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int a = 0;
        int b = 0;
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='0')a++;
            else b++;
        }
        System.out.println(n-Math.abs(a-b));
    }
}
