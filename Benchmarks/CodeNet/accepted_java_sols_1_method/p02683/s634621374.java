import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
		int x=sc.nextInt();
		
  		int cmin=(int)Math.pow(10,7);
  		int[] c=new int[n];
  		int[][] a=new int[n][m];
  		
		for(int e=0;e<n;e++){
    		c[e]=sc.nextInt();
           for(int b=0;b<m;b++){
           a[e][b]=sc.nextInt();
           }
    	}
  
    for(int f=0;f<(1<<n);f++){
      int[] ans=new int[m];
      int c2=0;
      int y=0;
    for(int g=0;g<n;g++){
    if((1&f>>g)==1){
      c2+=c[g];
      for(int l=0;l<m;l++){
    	ans[l]+=a[g][l];
      }
    }
    }
      for(int k=0;k<m;k++){
      if(ans[k]<x){
       y++;
      }
      }
      if(y==0){
       cmin=Math.min(c2,cmin);
      }
    }
  
 	if(cmin==Math.pow(10,7)){
    		System.out.println(-1);
    	}else{
     		System.out.println(cmin);
   	 }

    }
}