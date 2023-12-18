import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        if(s.length() == 2) {
            System.out.println(s);
        } else {
            System.out.println(s.reverse());
        }
    }
}