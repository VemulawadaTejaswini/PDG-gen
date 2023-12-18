import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
		
  		int[] h=new int[n];
		for(int c=0;c<n;c++){
    		h[c]=sc.nextInt();
    	}
  		int[] c=new int[n];
  		int[] a=new int[m];
  		int[] b=new int[m];
  		for(int d=0;d<m;d++){
    		a[d]=sc.nextInt();
          	b[d]=sc.nextInt();
          if(h[a[d]-1]<h[b[d]-1]){
          c[a[d]-1]++;
          }else if(h[a[d]-1]==h[b[d]-1]){
           c[a[d]-1]++;
           c[b[d]-1]++;
          }else{
          c[b[d]-1]++;
          }
    	}
  	int ans=0;
    for(int e=0;e<n;e++){
    if(c[e]==0){
    ans++;
    }
    }
 	

    	System.out.println(ans);
    }
}