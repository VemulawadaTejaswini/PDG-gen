import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int x = 1, y = 1, i = 1;
        
        while(i <= 3000){
            
            x = sc.nextInt();
            y = sc.nextInt();
            
            if(x == 0 && y == 0){
                break;
            }
            if(x >= y){
                System.out.printf("%d %d\n", y, x);
            }else if(y >= x){
                System.out.printf("%d %d\n", x, y);
            }
            
            i++;
        }
    }
}
