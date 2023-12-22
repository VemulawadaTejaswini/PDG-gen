import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str).setCharAt(3, '8');
        System.out.println(sb);
    }
}
