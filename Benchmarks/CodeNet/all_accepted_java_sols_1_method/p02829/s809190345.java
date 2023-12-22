import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a*b;
        if( ans == 2) {
        	System.out.println("3");
        }else if(ans == 3) {
        	System.out.println("2");
        }else {
        	System.out.println("1");
        }
}
    }