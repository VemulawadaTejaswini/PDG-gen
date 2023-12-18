import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        printHantei(W,H,x,y,r);

    }

    public static void printHantei(int W,int H,int x,int y,int r) {
        if(x>=r && y>=r) {
            if((H-x)>=r && (H-y)>=r) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else {
            System.out.println("No");
        }

    }

}
