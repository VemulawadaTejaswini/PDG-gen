import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int kazu = stdIn.nextInt();
        int weight[] = new int[kazu];
        int sum = 0;
        int dif = 0;
        int count = 0;
        
        for(int i = 0; i < kazu; i++){
            weight[i] = stdIn.nextInt();
            sum += weight[i];
        }
        
        dif = sum;
        int difsum = 0;
        
        for(int i = 0; i < kazu; i++){
            difsum += weight[i];
            if(Math.abs(sum - difsum - difsum) < dif){
                dif = Math.abs(sum - difsum - difsum);
                count = 0;
            }else{
                count++;
            }
            
            if(count == 3){
                break;
            }
        }
        
        System.out.println(dif);
    }
}
