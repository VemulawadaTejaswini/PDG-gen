import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt(); 
        int Z = sc.nextInt();
        if(X + Y + Z >= 22) {
        	System.out.println("bust");
        }else {
        	System.out.println("win");
        }
    }
}