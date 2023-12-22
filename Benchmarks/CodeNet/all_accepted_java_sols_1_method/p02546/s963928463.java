import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(str.charAt(str.length()-1) == 's' ? str + "es" : str + "s");
    }
}
