import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String p = scan.next();
        s = s + s;
        if (s.indexOf(p) != -1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}