import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if(x+r <= w && 0 <= x-r && y +r <= h && 0 <= y-r ){
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
        System.out.println();
    }
}
