import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int debt=100;
    
    
    
    for(int i=1; i<=n; i++){
    
    debt=(int)Math.ceil(debt*1.05);
    
    }
    
    System.out.println(debt*1000);
    
   }
   }
    