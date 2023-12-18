import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long A = scanner.nextLong();
        double B = scanner.nextDouble();
        double BI = B*100;
        long Sum = A*(long)BI/100;
        
        System.out.println(Sum);
    }
}
