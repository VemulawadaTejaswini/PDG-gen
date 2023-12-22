import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.print("a ");
        if (a<b) {
            System.out.print("<");
        }
        else if (a>b) {
            System.out.print(">");
        }
        else {
            System.out.print("==");
        }
        System.out.println(" b");
    }
}