import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double exp = num+Math.pow(num,2)+Math.pow(num,3);
        int result = (int)exp;
        System.out.println(result);
        scan.close();
    }
}