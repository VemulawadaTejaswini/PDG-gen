import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        System.out.println(r*r*Math.PI + " " + r*2*Math.PI);
    }
}