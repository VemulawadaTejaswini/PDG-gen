import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int amari = X%500;
        int ans = (X/500)*1000 + (amari/5)*5;
        System.out.println(ans);
        
    }
}
