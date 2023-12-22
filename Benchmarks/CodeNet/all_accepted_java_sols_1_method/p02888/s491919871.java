import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
  		int[] l=new int[n];
		for(int c=0;c<n;c++){
    		l[c]=sc.nextInt();
    	}
  		Arrays.sort(l);
    	int ans=0;
  	for(int a=0;a<n-2;a++){
      for(int b=a+1;b<n-1;b++){
        int max=n;
        int min=b+1;
        if(l[min]-l[b]>=l[a]){
        	continue;
        }
        while(max-min>1){
        	if(l[(max+min)/2]-l[b]<l[a]){
            	min=(max+min)/2;
            }else{
            	max=(max+min)/2;
            }
        }
       int ok=min;
       ans+=ok-b;
      }
    
    }


    	System.out.println(ans);
    }
}
