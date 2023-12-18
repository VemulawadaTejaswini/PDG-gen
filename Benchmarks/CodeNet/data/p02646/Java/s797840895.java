import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String[] str1 = c.nextLine().split(" ");
        String[] str2 = c.nextLine().split(" ");
        String str3 = c.nextLine();

        long position1 = Long.parseLong(str1[0]) + (Long.parseLong(str1[1]) * Long.parseLong(str3));
        long position2 = Long.parseLong(str2[0]) + (Long.parseLong(str2[1]) * Long.parseLong(str3));

        if (position1 >= position2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}