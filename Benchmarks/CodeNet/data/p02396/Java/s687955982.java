import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        int count=0;
        while(true){
            Scanner scan = new Scanner(System.in);
            int a =scan.nextInt();
            if(a==0){
                break;
            }else{
                count++;
                System.out.println("Case"+count+":"+a);
            }
        }
    
        
        
    }
}