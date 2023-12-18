import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int parameter = 2*x + 2*y;
        int area = x*y;
        System.out.println(area + " " + parameter);
    }
}
