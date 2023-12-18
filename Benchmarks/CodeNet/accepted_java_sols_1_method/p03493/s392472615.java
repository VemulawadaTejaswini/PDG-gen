import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = s.replaceAll("0", "");
        System.out.println(s.length());
    }
}