import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
  		long ans=0;

  		long[] h=new long[n];
		for(int c=0;c<n;c++){
    		h[c]=sc.nextInt();
          	ans+=h[c];
    	}
  		Arrays.sort(h);
  		int c=n-1;
  if(n<=k){
  		ans=0;
  }else{
     while(k>0){
  		ans-=h[c];
       c--;
     k--;
   }
  }		
    	System.out.println(ans);
    }
}