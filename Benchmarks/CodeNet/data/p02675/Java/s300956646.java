import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        // 格納
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a%10;
        //System.out.println(b);
        if(b==2 || b==4 || b==5 || b==7 || b==9){
            System.out.println("hon");
        }else if(b==3){
            System.out.println("bon");
        }else{
            System.out.println("pon");
        }
        
        
    }
}
        