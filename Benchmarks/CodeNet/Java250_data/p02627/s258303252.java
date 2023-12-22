import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letter= entrada.next().charAt(0);
        if (Character.isUpperCase(letter)){
            System.out.println("A");
        }else{
            System.out.println("a");
        }

    }
}