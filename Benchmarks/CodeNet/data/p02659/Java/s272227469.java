import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        double c = (double) a;
        double d = b * c;
        long e = (long)d;
        System.out.println(e);
        sc.close();
    }
}