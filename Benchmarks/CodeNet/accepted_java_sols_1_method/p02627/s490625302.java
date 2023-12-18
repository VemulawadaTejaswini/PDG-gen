import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arufa = sc.next();

        if(Character.isUpperCase(arufa.charAt(0))){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}