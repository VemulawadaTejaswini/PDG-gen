import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();
      	String label = (a1 + a2 + a3 >= 22) ? "bust" : "win";
      	System.out.println(label);
    }
 
}