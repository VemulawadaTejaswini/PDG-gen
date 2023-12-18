import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Double D = sc.nextDouble();
        Double T = sc.nextDouble();
        Double S = sc.nextDouble();
        
        if (D/S <= T){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}