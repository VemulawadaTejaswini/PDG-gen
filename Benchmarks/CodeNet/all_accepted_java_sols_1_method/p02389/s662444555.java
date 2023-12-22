import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, b, area, perimeter;
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
        area = a * b;
        perimeter = (a + b) * 2;
        
        System.out.print(area);
        System.out.print(' ');
        System.out.println(perimeter);
        
        
    }
}
