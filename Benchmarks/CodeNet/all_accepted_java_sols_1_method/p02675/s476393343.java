import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n>9 && n<100){
            n = n%10;
        }else if(n>99){
            n = n%100;
            n = n%10;
        }
        
        if(n==3){
            System.out.println("bon");
        }else if(n==0 || n==1 || n==6 || n==8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
        
   }
}
