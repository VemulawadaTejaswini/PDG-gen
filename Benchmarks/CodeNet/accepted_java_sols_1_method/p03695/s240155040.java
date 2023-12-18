import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] =new int[N];
		int B[] =new int[9];
        for(int i = 0; i < N; i++){
            A[i]=sc.nextInt();
            if(A[i]<400){
                B[0]++;
            }else if(A[i] < 800) B[1]++;
            else if(A[i] < 1200) B[2]++;
            else if(A[i] < 1600) B[3]++;
            else if(A[i] < 2000) B[4]++;
            else if(A[i] < 2400) B[5]++;
            else if(A[i] < 2800) B[6]++;
            else if(A[i] < 3200) B[7]++;
            else B[8]++;
        }
        
        int min = 0;
    
        for(int i = 0 ; i < 8 ; ++i){
        if(B[i] != 0){
            min++;
            }
        }
    
        int max = min + B[8];
        if(min == 0) min++;
    
        System.out.println(min+" "+max);
 
    }
}
