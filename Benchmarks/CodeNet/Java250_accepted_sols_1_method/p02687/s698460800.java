import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        String test = a.equals("ABC") ? "ARC" : "ABC";
        System.out.println(test);
    }
}