import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        int a,b,c;
        a = stdIn.nextInt();
        b = stdIn.nextInt();
        c = stdIn.nextInt();
        if (a < b && b < c) {
            System.out.println("Yes");
        }
        if (a > b && b > c){
            System.out.println("No");
        }
        if (a < b && b > c){
            System.out.println("No");
        }
        if (a > b && b < c){
            System.out.println("No");
        }
        if (a == b && b < c){
            System.out.println("No");
        }
        if (a < b && b ==c){
            System.out.println("No");
        }
        if (a == b && b > c){
            System.out.println("No");
        }
        if (a > b && b ==c){
            System.out.println("No");
        }
        if (a == b && b == c){
            System.out.println("No");
        }

    }
}