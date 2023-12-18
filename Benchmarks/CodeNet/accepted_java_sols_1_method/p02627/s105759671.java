import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String txt = sc.next().trim();
        
        if ('a' <= txt.charAt(0) && txt.charAt(0) <= 'z') {
            System.out.println('a');
        } else {
            System.out.println('A');
        }
    }
}