import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    
	    int n = sc.nextInt();
	    int s = sc.nextInt();
	    
	    if(n!=0 && s!=0){
		
		int[] m = new int[n];
		for(int i=0; i<n; i++){
		    m[i] = sc.nextInt();
		}

		int ans = 0;
		for(int i=0; i<n; i++){
		    for(int j=i+1; j<n; j++){
			if(m[i]+m[j] > s) ans++;
		    }
		}
	
		System.out.println(ans);
	    }
	}
    }
}