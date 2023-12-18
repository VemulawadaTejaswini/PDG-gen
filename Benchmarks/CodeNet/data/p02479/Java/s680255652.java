import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        double pi = 3.14159265359;
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        System.out.println(r * r * pi + " " + r * 2 * pi);
    }
}