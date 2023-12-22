import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double total = 0.0;
        for (int i = 0; i < N; i++) {
        	total += 1.0/sc.nextDouble();
        }
        System.out.println(1.0/total);
    }
}