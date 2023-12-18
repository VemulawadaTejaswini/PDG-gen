import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int W = scan.nextInt(); 
        int H = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();
        if((H - y) >= 0 && (H - r) >= 0 && (W - x) >= 0 && (W - r) >= 0){
            System.out.println("Yes");
        }
    }
}