import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        int count=0;
        Scanner scan = new Scanner(System.in);
        while(true){
            
            long a =scan.nextLong();
            if(a==0){
                break;
            }else{
                count++;
                System.out.println("Case "+count+": "+a);
            }
        }
    
        
        
    }
}