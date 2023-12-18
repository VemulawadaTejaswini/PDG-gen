import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String res = scan.nextLine();

        System.out.print(res.charAt(0));
        System.out.print(res.length()-2);
        System.out.println(res.charAt(res.length()-1));

    }
}