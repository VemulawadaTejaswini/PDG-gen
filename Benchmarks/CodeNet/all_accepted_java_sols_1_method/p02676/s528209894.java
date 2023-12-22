import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int charLimit;
        String str, tmp;

        charLimit = scan.nextInt();
        tmp = scan.nextLine();
        str = scan.nextLine();

        if(str.length() <= charLimit) {
            System.out.println(str);
        } else {
            System.out.println(str.substring(0, charLimit) + "...");
        }

        scan.close();
        return;
    }
}