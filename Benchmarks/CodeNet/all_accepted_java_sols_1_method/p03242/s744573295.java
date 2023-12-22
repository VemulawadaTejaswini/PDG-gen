import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        for (char c : chars) {
            if(c == '1') {
                System.out.print(9);
            } else if(c == '9') {
                System.out.print(1);
            } else {
                System.out.println(c);
            }
        }
        System.out.println();
    }
}