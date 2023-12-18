import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        if(n == 0){
            System.out.println(x);
            return;
        }
        
        int ans = 0;
        Set set = new HashSet();
        
        for(int i = 0; i < n; i++){
            int p = sc.nextInt();
            set.add(p);
        }
        
        for(int j = 0;j < 51 ;j++){
            int small = x - j;
            if(!set.contains(small)){
                System.out.println(small);
                return;
            }
            
            int large = x + j;
            if(!set.contains(large)){
                System.out.println(large);
                return;
            }
        }
    }
}
