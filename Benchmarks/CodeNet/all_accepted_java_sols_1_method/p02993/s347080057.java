import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[4];
    
        a[0] = n%10;
        n /=10;
        a[1] = n%10;
        n /=10;
        a[2] = n%10;
        n /=10;
        a[3] = n;
        int [] b = new int [4];
        for(int i=0;i<4;i++){
            b[i] = a[3-i];
        }
        
        


        int p=0;
        
        for(int i=0;i<3;i++){
            if(b[i]==b[i+1]){
                p = 1;
            }
            else if(b[2]==b[3]){
                p=1;
            }
             
            
        }
        if(p==1){
            System.out.println("Bad");
        }
        else {
            System.out.println("Good");

        }
    }
}