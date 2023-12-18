import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();

        if(n%500 <= a) System.out.println("Yes");
        else System.out.println("No");

        scan.close();
    
    }

}