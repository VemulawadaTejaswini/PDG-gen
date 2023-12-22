import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x = sc.nextLine();
        
        if (x.equals(x.toUpperCase())) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}