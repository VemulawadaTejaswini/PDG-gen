import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        
        int sum1 = 0;
        int sum2 = 0;
        
        if(n > 1){
            for(int i = n - 1; i > 0; i--){
                sum1 += i;
            }
        }
        
        if(m > 1){
            for(int i = m - 1; i > 0; i--){
                sum2 += i;
            }
        }
        

        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        
        int sum = sum1 + sum2;
        
        
        // for(int i = 0; i < s.length(); i++){
        //     a[i] = c[i] - 48;
        //     System.out.println(a[i]);
        // }
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
 
        System.out.println(sum);
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}