import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int sum = 0;
        
        for(int n=0; n<=N; n++){
            int dsum = 0;
            int value = n;
            while(value != 0){
                dsum += value % 10;
                value /=10;
            }
            
            if(A <= dsum && dsum <= B){
                sum += n;
            }
        }
        System.out.println(sum);
    }
}