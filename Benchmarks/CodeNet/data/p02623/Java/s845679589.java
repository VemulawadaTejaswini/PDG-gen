import java.util.*;
class Main{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int k=sc.nextInt();
	    Queue<Long> A=new LinkedList<>();
	    Queue<Long> B=new LinkedList<>();
	    
	    
	    for(int i=0;i<n;i++){
	A.add(sc.nextLong());
	    }for(int i=0;i<m;i++){
	B.add(sc.nextLong());
	    }
	    long sum=0;
	    long count=0;
	    while(sum<=k){
	    	if(!A.isEmpty()) {
	sum+=A.poll();
	if(sum<=k) {
		count++;
	}
	    	}
	      if(!B.isEmpty()&&sum<=k){
	        
	sum+=B.poll();
	if(sum<=k) {
		count++;
	}
	      }else{
	break;
	      }
	      
	    }
	    System.out.println(count);

  }
}
   
  