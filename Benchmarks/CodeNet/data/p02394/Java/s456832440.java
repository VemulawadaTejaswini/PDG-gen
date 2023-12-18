import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        if ((-100 <= x && x <= 100) && (-100 <= y && y <= 100) && (0 < W && W <= 100) && (0 < H && H <= 100) && (0 < r && r <= 100)){
        	if (0 < x + r  && x + r <= W && 0 < y + r && y + r <= H) {
        		System.out.println("Yes");
        		}else{
        			System.out.println("No");
        			}
        	}
    }
}
