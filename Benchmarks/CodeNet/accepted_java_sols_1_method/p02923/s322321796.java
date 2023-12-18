import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int[] h = new int[n];
		int ans = 0;
		int count = 0;
		
		for(int i=0; i<n; i++){
		    h[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++){
		    if(h[i] >= h[i+1]){
		        count++;
		        if(count > ans){
		            ans = count;
		        }
		    }else{
		        if(ans < count){
		            ans = count;
		        }
            count = 0;
		    }
		}
		
		
		System.out.println(ans);
    }
}
