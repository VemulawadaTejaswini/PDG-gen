import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
if(x>=0&&100>=x&&y>=0&&100>=y){
    if(0<W&&0<H&&0<r&&100>=W&&100>=H&&100>=r)
        if (W - x - r >= 0 && W >= r + x && H - y - r >= 0 && H >= y + r) {
            System.out.println("Yes");
        } else {
            System.out
                    .println("No");
        }}
    }
}