import java.lang.Character;
import java.util.Scanner;

public class Main {

    static void solve(String s ) {
        char bruh = s.charAt(0);
        if(Character.isUpperCase(bruh)){
            System.out.println("A");
        } else System.out.println("a");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            String input = in.next();
            solve(input);

    }
}