import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = s.indexOf("A");
        int j =s.lastIndexOf("Z");

        System.out.println(j - i + 1);

    }
}