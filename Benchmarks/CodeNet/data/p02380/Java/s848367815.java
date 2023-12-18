import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double h = b * Math.sin(c / 180 * Math.PI);
        System.out.println(a * h / 2);
        System.out.println(a+b+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        System.out.println(h);
    }
}