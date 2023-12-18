import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int W = input.nextInt();
        int H = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int r = input.nextInt();

        if (0 <= x - r && x + r <= W && 0 <= y - r && y + r <= H){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}