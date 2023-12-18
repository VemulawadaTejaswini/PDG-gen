import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        
        int maxX = X;
        int minY = Y;
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(sc.next());
            if(x > maxX) maxX = x;
        }
        for(int i = 0; i < m; i++){
            int y = Integer.parseInt(sc.next());
            if(y < minY) minY = y;
        }
        
        if(maxX < minY){
            System.out.println("No War");
        }else{
            System.out.println("War");
        }
    }
}