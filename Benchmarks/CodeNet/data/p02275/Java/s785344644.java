import java.util.*;

public class Main {
	
	static final int MAX_K = 10000;
	
    public static void main(String[] args) {

        int[] Count_ar = new int[MAX_K];

        //initialize
        for (int i = 0; i < MAX_K; i++){
        	Count_ar[i] = 0;
        }
    	
    	//input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[]    In_ar = new int[N],
                Out_ar = new int[N];
        
        for(int i = 0; i < N; i++){
        	In_ar[i] = sc.nextInt();
        }

        //calculation
        for(int i = 0; i < N; i++){
        	Count_ar[In_ar[i]]++;
        }
        
        for (int j = 1; j < MAX_K; j++){
        	Count_ar[j] += Count_ar[j - 1];
        }

        for (int i = 0; i < N; i++){
        	Out_ar[Count_ar[In_ar[i]] - 1] = In_ar[i];
        	Count_ar[In_ar[i]]--;
        }
        
        //output
        for(int i = 0; i < N; i++){
        	System.out.print(Out_ar[i]);

        	if(i < N - 1){
        		System.out.print(" ");
        	}
        }
        System.out.println();
    }
}