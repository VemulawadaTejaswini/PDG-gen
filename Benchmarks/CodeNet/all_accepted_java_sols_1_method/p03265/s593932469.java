import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print((x2 - (y2 - y1))+" "+(y2 + (x2 - x1))+" "+(x1 - (y2 - y1))+" "+(y1 + (x2 - x1)));
        
    }
}



