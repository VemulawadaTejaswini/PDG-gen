import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int out;
        
        for(int i = 0; i < 10; i++){
            out = a * c - b;
            System.out.println(out);
            c = out;
        }
    }
}
