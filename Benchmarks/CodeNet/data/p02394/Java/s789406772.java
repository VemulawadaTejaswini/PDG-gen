import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int range_x = sc.nextInt(), range_y = sc.nextInt();
        int center_x = sc.nextInt(), center_y = sc.nextInt(), radius = sc.nextInt();
        if (center_x >= radius && center_y >= radius && (range_x - center_x) >= radius && (range_y - center_y) >= radius) System.out.println("Yes");
        else System.out.println("No");
    }
}
