import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        if(t.startsWith(s)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}