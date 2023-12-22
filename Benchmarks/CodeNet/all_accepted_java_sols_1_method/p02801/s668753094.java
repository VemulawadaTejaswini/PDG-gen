import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alfabet = "abcdefghijhlmnopqrstuvwxyz";

        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        int index = alfabet.indexOf(c.charAt(0));

        System.out.println(alfabet.charAt(index + 1));
    }
}