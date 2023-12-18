import java.util.Scanner;

public class Main {
    
    public static final int N = 3;

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        // W H x y r
        
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        if(r<=x && r<=y && x+r<=W && y+r<=H){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
}
