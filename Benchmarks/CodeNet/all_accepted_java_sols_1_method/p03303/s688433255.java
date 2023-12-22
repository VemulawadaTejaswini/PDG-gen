import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int w = sc.nextInt();
        
        String result = "";
        for (int i = 0; i < s.length; i+=w) result += s[i];
        System.out.println(result);
    }
}
