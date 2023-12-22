import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if(x >= r && (W-r) >= x && y >= r && (H-r) >= y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
