import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        boolean is = false;
        for(int i = 0; i < N; i++){
            if(A[i] % 2 == 0){
                if(A[i] % 3 == 0 || A[i] % 5 == 0){

                }else{
                    is = true;
                }
            }
        }
        
        if(is){
            System.out.println("DENIED");
        }else{
            System.out.println("APPROVED");
        }
	}
} 