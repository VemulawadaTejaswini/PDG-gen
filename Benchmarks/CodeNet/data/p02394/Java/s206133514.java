import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String[] inputNums = scan.nextLine().split(" ");
        System.out.println(isInCircleRect(inputNums));
    }
    private static String isInCircleRect(String[] inputNums) throws IOException {
        int W = Integer.parseInt(inputNums[0]);
        int H = Integer.parseInt(inputNums[1]);
        int x = Integer.parseInt(inputNums[2]);
        int y = Integer.parseInt(inputNums[3]);
        int r = Integer.parseInt(inputNums[4]);

        if ((-100 <= x && x <= 100) && (-100 <= y && y <= 100)
            && (
                (0 < W && W <= 100) && (0 < H && H <= 100) && (0 < r && r <= 100)
                )
            ) {
            if (0 <= x + r  && x + r <= W && 0 <= y + r && y + r <= H) {
                return "Yes";
            }
        } else {
            throw new IOException();
        }
        return "No";
    }
}