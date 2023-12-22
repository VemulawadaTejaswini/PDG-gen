import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        double area = (double)w * h / 2;
        if(x == w / 2 && y == h / 2 && w % 2 == 0 && h % 2 == 0){
            System.out.println(area + " " + 1);
        }else{
            System.out.println(area + " " + 0);
        }
    }
}