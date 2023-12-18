
import java.util.Scanner;


public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum=0;
        for(int k=1;k<=n;k++){        
            sum=sum+ (k*divisor(k));
        }
        
        System.out.println(sum);
   
    }
   
    static int divisor(int number){
        int count=0;  
        for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    
}
