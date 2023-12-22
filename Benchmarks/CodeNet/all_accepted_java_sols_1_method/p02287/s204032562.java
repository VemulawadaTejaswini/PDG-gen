import java.util.*;


public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 
        int[] A = new int[N+1];		//?????????index?????? 1~N+1?????????
        for(int i=0; i<N; i++)		
            A[1+i] = sc.nextInt();	
 
 		for(int i=1; i<N+1; i++){	
	        int parent = i/2;
	        int left = 2*i;
	        int right = 2*i +1;

	        String id,k,pk,lk,rk;
	        id = "node "+i+": ";
	        k  = "key = "+ A[i] + ", ";
	        pk = ( (i!=1)? "parent key = " + A[parent] + ", " : "" );
	      	lk = ( (left<=N)?  "left key = "+A[left] + ", " : "");
                rk = ( (right<=N)? "right key = "+A[right] + ", " : "");
            
                System.out.print(id + k + pk + lk + rk + "\n");
	}
 
    }
}