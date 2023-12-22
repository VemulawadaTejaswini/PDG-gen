import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        double h = Double.parseDouble(sc.next());
        double m = Double.parseDouble(sc.next());
        double res = Math.sqrt(
                Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.abs((h + m / 60) / 12 - m / 60) * 2 * Math.PI));
        System.out.println(res);  
    }
}