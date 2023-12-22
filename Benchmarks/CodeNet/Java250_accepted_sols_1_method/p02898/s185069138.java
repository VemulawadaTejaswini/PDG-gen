import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int K =sc.nextInt();
        int FR[] =new int[N];
        int count =0;
        
        for(int i=0;i<N;i++){
            FR[i]=sc.nextInt();
        }
        for(int j=0;j<N;j++){
            if(FR[j]>=K){
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}
