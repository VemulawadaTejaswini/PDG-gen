import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int x = scanner.nextInt();
        int h = x / 3600;
        int m = (x - h*3600) / 60;
        int s = x - h*3600 - m*60;

        System.out.print(h);
        System.out.print(":");
        System.out.print(m);
        System.out.print(":");
        System.out.println(s);
    }
}
