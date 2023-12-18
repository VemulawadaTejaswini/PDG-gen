import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int k = Integer.parseInt(sc.next());
        
        System.out.println((k/2)*((k+1)/2));
    }
}