import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long sum = 1;
        int sosu[] = new int[n];
        sosu[0] = 1;
        int sosuCount = 1;
        
        System.out.println("a");
        for(int i = 1; i <= n; i++){
            int count = 0;
            boolean sosuFlag = true;
            
            for(int j = 0; sosu[j] * sosu[j] <= i; j++){;
                if(i % sosu[j] == 0){
                    sosuFlag = false;
                    if(j * j != i){
                        count += 2;
                    }else{
                        count++;
                        break;
                    }
                }
            }
            
            if(sosuFlag){
                sosu[sosuCount] = i;
                sosuCount++;
            }
            
            sum += i * count;
            System.out.println(sum);
        }
        
        
        System.out.println(sum);
    }
}
