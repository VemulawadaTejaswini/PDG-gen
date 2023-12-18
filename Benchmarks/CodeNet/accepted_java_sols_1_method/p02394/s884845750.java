import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int max_X = x + r;
        int min_X = x - r;
        int max_Y = y + r;
        int min_Y = y - r;
        if((max_X <= w)&&(0 <= min_X)&&(max_Y <= h)&&(0 <= min_Y)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
