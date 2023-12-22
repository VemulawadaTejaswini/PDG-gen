import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int e1 = Integer.parseInt(scanner.next());
        int e2 = Integer.parseInt(scanner.next());
        int e3 = Integer.parseInt(scanner.next());
        int e4 = Integer.parseInt(scanner.next());

        if (e1 == e2) {
            if (e3 == e4) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else if (e1 == e3) {
            if (e2 == e4) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else if (e1 == e4) {
            if (e2 == e3) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
    }
}

