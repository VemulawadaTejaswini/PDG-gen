import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long sum = 0;
        int dis[] = new int[n];
        boolean flag = true;
        
        for(int i = 0; i < n; i++){
            dis[i] = stdIn.nextInt();
        }
        
        if(dis[0] == 0){
            Arrays.sort(dis);
            long num = 0;
            
            if(n > 1){
                if(dis[1] == 0){
                    flag = false;
                }
            }else{
                flag = false;
            }
            
            boolean flafla = true;
            
            if(flag){
                int index = 0;
                for(int i = 1; i < n; i++){
                    if(dis[i] == 1){
                        num++;
                    }else{
                        index = i;
                        break;
                    }
                    
                    if(i == n - 1){
                        flafla = false;
                    }
                }
                
                sum = 1;
                long num2 = num;
                
                if(flafla){
                    for(int i = index; i < n; i++){
                        if(dis[i - 1] == dis[i]){
                            sum = (sum * num) % 998244353;
                            //System.out.println(num + " " +sum + " ue");
                            num2++;
                        }else if(dis[i - 1] + 1 == dis[i]){
                            num = num2;
                            sum = (sum * num) % 998244353;
                            //System.out.println(num + " " +sum + " shita");
                            num2 = 1;
                        }else{
                            sum = 0;
                        }
                    }
                }
                System.out.println(sum);
            }else{
                System.out.println(0);
            }
            
            
        }else{
            System.out.println(0);
        }
        
    }
}
