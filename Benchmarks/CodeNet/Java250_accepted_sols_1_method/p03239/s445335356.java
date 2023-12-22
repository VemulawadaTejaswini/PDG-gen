import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int T =sc.nextInt();
        int result=0;
       
       
        
        int cost[] = new int[N];
        int time[] = new int[N];
        
        for(int i=0;i<N;i++){
            cost[i]=sc.nextInt();
            time[i]=sc.nextInt();
        }
        
        int Min=cost[0];
        
        for(int j=0;j<N;j++){
            if(T>=time[j]){
                if(Min>cost[j]){
                    Min=cost[j];
                }
                result=1;
            }

        }
        
        if(result==0){
            System.out.println("TLE");
        }else{
            System.out.println(Min);
        }
        
    }
}
