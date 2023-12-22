import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
       
        for(int i=1;i<=n;i=i+2){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
                if(count==8){
                    
                    result++;
                }
            }
            
        }


        System.out.println(result);
    


    }
}