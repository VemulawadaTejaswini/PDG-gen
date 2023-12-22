import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String coffee;
        Scanner scan = new Scanner(System.in);


        coffee = scan.nextLine();

        if(coffee.length() == 6 && method(coffee)) {
            if(coffee.charAt(2) == coffee.charAt(3) &&
               coffee.charAt(4) == coffee.charAt(5)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }

    public static boolean method(String s) {
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        a:
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < alpha.length; j++) {
                if(s.charAt(i) == alpha[j]) {
                    continue a;
                }
            }
            return false;
        }

        return true;
    }
}