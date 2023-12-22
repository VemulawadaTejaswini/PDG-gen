import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int n = sc.nextInt();
        if(x >= n) {
            System.out.println(10);
        } else {
            System.out.println(0);
        }
    }
}