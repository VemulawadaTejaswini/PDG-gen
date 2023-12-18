import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        int whole = H * W;
        int black = H * w + h * W - h * w; 
        int white = whole - black;
        
        System.out.println(white);
    }
}
