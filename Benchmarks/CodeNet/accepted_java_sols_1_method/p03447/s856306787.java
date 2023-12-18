import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
        
        System.out.println((X-A)%B);
    }
    
}