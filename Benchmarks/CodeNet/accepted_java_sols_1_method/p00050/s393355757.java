import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        t = t.replaceAll("apple", "@@@zzzzzzz");
        t = t.replaceAll("peach", "apple");
        t = t.replaceAll("@@@zzzzzzz", "peach");
        System.out.println(t);
    }
}
