import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        String str = null;

        if (x+r<=W && x-r>=0 && y+r<=H && y-r>=0) str = "Yes";
        else str = "No";

        System.out.println(str);

    }
}
