import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String p = scan.nextLine();

        String ans = s + s.substring(0, p.length());

        if (ans.indexOf(p) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}