import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer k = Integer.parseInt(sc.next());
        
        String num = Integer.toString(n, k);
        int result = num.length();
        
        System.out.println(result);
    }
}
