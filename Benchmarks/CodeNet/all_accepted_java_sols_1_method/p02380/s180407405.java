import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);
        
        double S = a * b * Math.sin(Math.toRadians(c)) / 2;
        double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        double h = b * Math.sin(Math.toRadians(c));
        System.out.println(S);
        System.out.println(L);
        System.out.println(h);
    }
 }
