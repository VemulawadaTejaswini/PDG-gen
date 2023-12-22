import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
  		long a=n%k;
  		long b=k-a;
		long c=Math.min(a,b);
  		long ans=Math.min(c,n);
   

    	System.out.println(ans);
    }
}

