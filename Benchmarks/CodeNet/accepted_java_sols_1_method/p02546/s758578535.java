import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String last = line.substring(line.length() -1 , line.length());
        if ("s".equals(last)) {
            System.out.println(line + "es");
        } else {
            System.out.println(line + "s");
        }
    }
}
