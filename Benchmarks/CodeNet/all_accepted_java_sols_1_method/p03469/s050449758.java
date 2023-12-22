import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        if (s.startsWith("2017"))
            System.out.println(s.replace("2017", "2018"));
        else
            System.out.println(s);
    }
}