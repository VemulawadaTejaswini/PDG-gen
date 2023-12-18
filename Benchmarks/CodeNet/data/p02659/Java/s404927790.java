import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        long A = scanner.nextLong();
        double B = scanner.nextDouble();
        double BI = B*1000;
        long Sum = A*(long)BI/1000;
        
        System.out.println(Sum);
    }
}
