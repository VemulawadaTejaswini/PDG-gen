import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int W = scn.nextInt();
        int H = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();
        int r = scn.nextInt();
        if ((x-r >= 0 && x+r <= W ) && (y-r >= 0 && y+r <= H)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}
