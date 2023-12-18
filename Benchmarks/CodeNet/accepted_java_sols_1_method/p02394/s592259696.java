import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int w = sc.nextInt();
         int h = sc.nextInt();
         int x = sc.nextInt();
         int y = sc.nextInt();
         int r = sc.nextInt();
         
         boolean isH = y+r<=h&&y-r>=0;
         boolean isW = x+r<=w&&x-r>=0;

        System.out.println(isH&&isW?"Yes":"No");
    }
}
