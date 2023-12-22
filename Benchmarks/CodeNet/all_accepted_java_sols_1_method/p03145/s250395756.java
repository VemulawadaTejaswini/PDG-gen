import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int ab = Integer.parseInt(sc.next());
        int bc = Integer.parseInt(sc.next());
        
        System.out.println((ab * bc)/2);
    }
}