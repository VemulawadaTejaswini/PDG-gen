import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        System.out.println(k.lastIndexOf('Z') - k.indexOf('A') + 1);

    }

}