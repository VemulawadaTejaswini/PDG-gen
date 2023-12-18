import java.util.*;
class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = sum(N);
        if(sum%9==0)
            System.out.println("Yes");
        else 
            System.out.println("No");
        
        
    }
    
    
    public static int sum(int N){
        int length = 0;
        int helper = N;
        while(helper>1)
        {
            helper/=10;
            length++;
        }
        length+=1;
        int sum = 0;
        for(int i = 0; i<length;i++){
            sum+= N%10;
            N/=10;
        }
        return sum;
    }
    
    
    
    
}