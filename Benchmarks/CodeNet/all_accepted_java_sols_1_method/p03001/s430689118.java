import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int  count = 0;
        if (x *2 == width && y * 2 == height){
            count = 1;
        }

        double area = (double)width * (double)height / 2.0;

        System.out.println(String.valueOf(area) + " " + String.valueOf(count));

    }
}