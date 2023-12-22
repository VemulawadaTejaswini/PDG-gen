import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        int num = 0;
        int v = B - A;
        
        for(int i = 0; i < v; i++) {
            sum += i;
        }
        System.out.println(sum - A);
    }
}