import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("a " + (a==b?"==":(a>b?">":"<")) + " b");
    }
}