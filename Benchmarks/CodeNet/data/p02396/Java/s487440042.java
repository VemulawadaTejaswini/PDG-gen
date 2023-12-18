import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        int x = 1;
        
        while(i <= 10000){
            
            x = sc.nextInt();
            
            if(x == 0){
                break;
            }
            System.out.printf("Case %d: %d\n", i, x);
            
            i++;
            
        }
    }
}
