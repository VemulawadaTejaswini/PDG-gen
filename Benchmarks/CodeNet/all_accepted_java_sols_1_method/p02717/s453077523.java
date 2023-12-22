import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = Integer.parseInt(scan.next());
        int Y = Integer.parseInt(scan.next());
        int Z = Integer.parseInt(scan.next());
        
        System.out.println(Z + " " + X + " " + Y);
        scan.close();
    }
}