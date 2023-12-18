import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int R = 0;
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        R = scan.nextInt();
        sum = R * 2 * 3.141592;
        System.out.println(sum);
        scan.close();
    }
}