import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long sum = 5;
        int sosu[] = new int[n];
        sosu[0] = 1;
        sosu[1] = 2;
        int sosuCount = 2;
        
        //System.out.println("a");
        for(int i = 3; i <= n; i++){
            int count = 2;
            boolean sosuFlag = true;
            
            for(int j = 1; sosu[j] * sosu[j] <= i; j++){
                //System.out.println(i + " " +  sosu[j]);
                if(i % sosu[j] == 0){
                    sosuFlag = false;
                    if(sosu[j] * sosu[j] != i){
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
            //System.out.println(i);
        }
        
        
        System.out.println(sum);
    }
}
