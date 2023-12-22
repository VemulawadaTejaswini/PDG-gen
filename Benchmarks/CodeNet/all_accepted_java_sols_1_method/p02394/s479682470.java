import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();
        
        boolean inW = (x - r  >= 0) && (W - r >= x) && (x >= 0);
        boolean inH = (H - r  >= 0) && (H - r >= y) && (y >= 0);
        
        System.out.println(inW && inH ? "Yes" : "No");
    }
}

