import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if ((x >= r && (x + r) <= W) && (y >= r && (y + r) <= H)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
