import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
       
  		long ans=0;
  
  		long[] a=new long[5];
		for(int c=0;c<5;c++){
    		a[c]=sc.nextLong();
    	}
  		Arrays.sort(a);
  if(n>a[0]){
    if(n%a[0]==0){
    	ans=n/a[0]+4;
    }else{
    ans=n/a[0]+5;
    }
  }else{
  ans=5;
  }

    	System.out.println(ans);
    }
}
