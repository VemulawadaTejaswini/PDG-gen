import java.util.*;
import java.math.*;
 
 
public class Hack{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
         
        
 
        for(int n = 1; n <= N ; n++){
        int x = 0;
        int y = 0;
        int z = 0;
            for(int i = 1; i < (int)Math.sqrt(n) ; i++){
            for(int j = 1; j <(int) Math.sqrt(n) ; j++){
                for(int k = 1; k <= (int)Math.sqrt(n) ; k++){
                    if(((i*i)+(j*j)+(k*k)+(i*j)+(i*k)+(j*k)) == n){
                        x = i;
                        y = j;
                        z = k;
                        i = j = k = n;
                    }
 
                  }
             }
        }
 
         if(x <= 0 || y <= 0 || z <= 0)
            System.out.println(0);
        else
        if(x == y && y == z)
            System.out.println(1);
        else
        if(x==y || y == z || x == z)
            System.out.println(3);
        else
          	System.out.println(6);
        
        
       // System.out.println(" "+ x + " "+ y + " " + z + "--->"+n);
       
        }
        
    }
}