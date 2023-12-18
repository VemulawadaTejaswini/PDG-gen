import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        
        System.out.println(Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
    }
}