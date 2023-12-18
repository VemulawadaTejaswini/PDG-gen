import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(squareArea(x,y) + " " + squarePerimeter(x,y));
    }
    public static int squareArea(int x, int y){
        return x * y;
    }
    public static int squarePerimeter(int x, int y){
        return (x + y) * 2;
    }
}
