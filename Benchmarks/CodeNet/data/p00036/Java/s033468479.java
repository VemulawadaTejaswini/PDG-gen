import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                sb.append(sc.nextLine());
            }
            sb.append("0110");
            String str = sb.toString();
            if (str.split("1111").length == 2)
                System.out.println("C");
            else if (str.split("11")[1].length() == 6)
                System.out.println("A");
            else if (str.split("11")[1].length() == 7)
                System.out.println("E");
            else if (str.split("11")[1].length() == 5)
                System.out.println("G");
            else if (str.split("1")[1].length() == 6)
                System.out.println("D");
            else if (str.split("11").length == 3)
                System.out.println("F");
            else
                System.out.println("B");
            if (sc.hasNext())
                sc.nextLine();
            else
                break;

        }
    }
}