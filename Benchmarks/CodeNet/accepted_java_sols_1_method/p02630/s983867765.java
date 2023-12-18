import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		long[] b= new long[100001];
  		long sum=0;
  
		for(int c=0;c<n;c++){
    		int a=sc.nextInt();
            b[a]++;
          	sum+=a;
    	}
  	int q=sc.nextInt();
  
  for(int d=0;d<q;d++){
 	 int b1=sc.nextInt();
    int c=sc.nextInt();
    sum=sum-b[b1]*(long)b1+b[b1]*(long)c;
    System.out.println(sum);
    b[c]+=b[b1];
    b[b1]=0;
  
  }

    	
    }
}