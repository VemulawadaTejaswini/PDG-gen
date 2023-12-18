import java.util.Scanner;
public class Main{
  
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
       System.out.println(gcd(a,b));
    
       
    
       
    }//main
    
     public static int gcd(int a,int b){
            if(b == 0){
                return a;
            }//if
            return gcd(b, a % b);
        }//gcd
    
}//main
