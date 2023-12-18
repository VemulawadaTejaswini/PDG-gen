import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        if (line.lastIndexOf('s') != -1) {
            System.out.println(line + "es");
        } else {
            System.out.println(line + "s");
        }
    }
}
