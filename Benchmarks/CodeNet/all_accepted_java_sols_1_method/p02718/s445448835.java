import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        int count1 = 0;  //総投票数
        int count2 = 0;  //総投票数の1/4M以上の票を集めた商品数
        
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
            count1 += A[i]; 
        }
        
        for(int i=0; i<N; i++){
            if((double)((double)count1/(4*(double)M))<=A[i]){
                count2 += 1;
            }
        }
        
        if(count2>=M){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
