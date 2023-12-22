import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        int n,m;
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();
        m = input.nextInt();
        
        if(n >= 2 && n <= 100 && m >= 2 && m <= 100){
            
            int sum = (n-1) * (m-1);
        
        System.out.println(sum);
        
        }
        
      }
    }
    