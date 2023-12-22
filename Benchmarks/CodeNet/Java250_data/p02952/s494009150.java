
import static java.lang.Math.log10;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
       int sum = 0 ;
        for(int i = 1 ; i<=n ; i++){
            
          
           double j =0;
           j = (int)log10(i)+1;
           
            if(j%2==1){
                sum++;
            }
        }
            
         /*   int count =0;
            while(i!=0){
                i=i/10;
                count++;
            }
            if(count%2==1){
                sum++ ;
            }
        }*/
        System.out.println(sum);
          
    }
}
