import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k,n,m = 0,sum = 0;

        k = sc.nextInt();
        
        for(int a = 1; a <= k; a++){
            for(int b = 1; b <= k; b++){
                for(int c = 1; c <= k; c++){
                    
                    int x,y,z,tmp;
                    x = a;
                    y = b;
                    z = c;
                    
                    if(a < b){
                        x = b;
                        y = a;
                    }
                    
                    
                    while ((tmp = x % y) != 0) {
                        x = y;
                        y = tmp;
                    }
                    
                    while ((tmp = y % z) != 0) {
                        y = z;
                        z = tmp;
                    }
                    
                    sum += z;

                }
            }
            
        }
        
        System.out.println(sum);
    }
}
