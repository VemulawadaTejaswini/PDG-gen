import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] arr = new int[n];
	    int flag =0;
	    for(int i=0;i<n;i++){
	    	arr[i]=sc.nextInt();
	    	if(arr[i]==1){
	    		flag=1;
	    	}
	    }
	    if(flag==1)System.out.println(1);
	    else if(flag==0){
	    	Arrays.sort(arr);
	    	boolean[] vis = new boolean[arr[n-1]+1];
	    	Arrays.fill(vis,true);
	    	int[] count = new int[arr[n-1]+1];
	    	for(int i=0;i<n;i++){
	    		count[arr[i]]++;
	    	}
	    	for(int i=0;i<n;i++){
	    		if(vis[arr[i]]==true){
	    			for(int j=2*arr[i];j<=arr[n-1];j+=arr[i]){
	    				//System.out.println(j);
	    				vis[j]=false;
	    			}
	    		}
	    	}
	    	int ans=0;
	    	for(int i=0;i<n;i++){
	    		if(vis[arr[i]]==true && count[arr[i]]==1){
	    			ans++;
	    		}
	    	}
	    	System.out.println(ans);
	    }

	}
	
}