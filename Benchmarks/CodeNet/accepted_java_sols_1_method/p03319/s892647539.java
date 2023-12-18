import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double n = Double.parseDouble(sc.next());
        double k = Double.parseDouble(sc.next());
        
        int ans = (int)Math.ceil((n-1) / (k-1));
        System.out.println(ans);
    }
}