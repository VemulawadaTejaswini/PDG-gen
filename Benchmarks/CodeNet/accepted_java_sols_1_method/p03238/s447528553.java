import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.equals("1")) {
            System.out.println("Hello World");
        } else {
            String line2 = sc.nextLine();
            String line3 = sc.nextLine();    
            int a = Integer.parseInt(line2);
            int b = Integer.parseInt(line3);
            System.out.println(a+b);
            
        }
        sc.close();
    }
}
