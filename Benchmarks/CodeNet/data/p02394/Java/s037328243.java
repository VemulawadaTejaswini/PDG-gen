import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        
        if((0 > x-r) || (W < x+r)){
            System.out.println("No");
        }else if((0 > y-r) || (H < y+r)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        
    }
}

