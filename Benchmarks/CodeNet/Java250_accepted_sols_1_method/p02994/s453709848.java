
import java.util.Scanner;

class Main {
    
    public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int fl = 0 , min = d , sum =0; 
        for(int i =2 ; i<=n ; i++){
            
            fl = (d+i)-1;
            if(Math.abs(fl)<Math.abs(min)){
                sum+=min ;
                min = fl ;
            } else{
                sum+=fl ;
            }
        }
        
        System.out.println(sum);
    }
}