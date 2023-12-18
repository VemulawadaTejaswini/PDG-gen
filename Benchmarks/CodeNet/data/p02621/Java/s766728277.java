import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
 
        String a = scan.nextInt();
 
        System.out.println(a+a^2+a^3);
 
    }
 
}