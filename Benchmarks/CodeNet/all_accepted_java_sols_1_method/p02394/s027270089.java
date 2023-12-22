import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int w = s.nextInt();
        int h = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        int r = s.nextInt();

        String result;
        if((x >= w || y >= h || x <= 0 || y <= 0) || !(w - x >= r && h - y >=r)){
            result = "No";
        } else {
            result = "Yes";
        }

        System.out.println(result);
    }

}