import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
  		int ans=0;
  		int min=0;
  		int max=0;
  		int g=0;
  if(n==0){
  ans=x;
  }else{
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		 a[c]=sc.nextInt();
    	}
    
    Arrays.sort(a);
    for(int b=x;b<100;b++){
      g=0;
    for(int d=0;d<n;d++){
    	if(a[d]==b){ 
          g=1;
          break;
        }
    }
     if(g==0){
       max=b;
       break;
      }
    }
    for(int b=x-1;b>0;b--){
      g=0;
    for(int d=0;d<n;d++){
    	if(a[d]==b){ 
          g=1;
          break;
        }
    }
     if(g==0){
       min=b;
       break;
      }
    }
    if((max-x)>=(x-min)){
    ans=min;
    }else{
    ans=max;
    }
  
  }
    

    	System.out.println(ans);
    }
}