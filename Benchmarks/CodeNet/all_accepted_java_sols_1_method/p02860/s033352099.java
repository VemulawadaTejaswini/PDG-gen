import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer lenChara = Integer.valueOf(scan.nextLine());
        String targetChara = scan.nextLine();

        if (lenChara % 2 == 0) {
            int divide = lenChara / 2;
            String start = targetChara.substring(0, divide);
            String end = targetChara.substring(divide, targetChara.length());
            if (start.equals(end)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}