import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        for(int i=1; i<=1250; i++){
            if(Math.floor(i*0.08)==a && Math.floor(i*0.1)==b){
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");
   }
}
