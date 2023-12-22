import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        double H = scanner.nextDouble();
        double A = scanner.nextDouble();
        long S = (long)Math.ceil(H/A);
        
        System.out.println(S);
    }
}
