import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        double B = Double.parseDouble(sc.next());
        System.out.println((long)Math.floor(A*B));
    }
}