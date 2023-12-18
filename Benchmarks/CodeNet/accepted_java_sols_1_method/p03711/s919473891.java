import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String s = "abacacaacaca";
        if (s.substring(x-1, x).equals(s.substring(y-1,y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
