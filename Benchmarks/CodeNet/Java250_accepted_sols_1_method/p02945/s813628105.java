import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        String[] strs = str.split(" ");

        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);

        int max = a + b;
        int sub = a - b;
        int mul = a * b;

        if (max < sub) {
            max = sub;
        }

        if (max < mul) {
            max = mul;
        }

        System.out.print(max);
    }
}
