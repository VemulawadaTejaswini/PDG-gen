import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s, 0, 4);
        sb.append(' ');
        sb.append(s, 4, s.length());
        System.out.println(sb);
    }

}
