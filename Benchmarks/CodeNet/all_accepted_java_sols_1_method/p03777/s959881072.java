import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c;
        if(b == 'H') {
            c = a == 'H' ? 'H' : 'D';
        } else {
            c = a == 'D' ? 'H' : 'D';
        }
        System.out.println(c);
    }
}