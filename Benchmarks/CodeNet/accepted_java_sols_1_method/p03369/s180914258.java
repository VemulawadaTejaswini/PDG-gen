import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int price = 700;

        if(S.charAt(0) == 'o'){
            price += 100;
        }

        if(S.charAt(1) == 'o'){
            price += 100;
        }

        if(S.charAt(2) == 'o'){
            price += 100;
        }

        System.out.println(price);
    }
}