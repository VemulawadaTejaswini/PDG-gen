import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 && y == 0)
                break;
            int n = 0;
            if(x>y){
                n = x;
                x = y;
                y = n;
            }
            System.out.println(x + " " + y);
        }
    }
}
                
