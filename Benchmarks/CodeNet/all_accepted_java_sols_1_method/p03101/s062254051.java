import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        sc.close();

        int area = H*W;
        int result = area - h*W - (H-h)*w;

        System.out.println(result);
    }
}
