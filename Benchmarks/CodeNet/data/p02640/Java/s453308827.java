import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(y % 2 == 1){
            System.out.println("No");
        }else{
            while(x > 0){
                if(4 <= y){
                    y -= 4;
                }else{
                    y -= 2;
                }
                x--;
                if(y == 0){
                    System.out.print("Yes");
                    System.exit(0);
                }
            }
            System.out.println("No");
            
        }
    }
}
