import java.util.Scanner;
public class Main{
	static int[]heap;
    static int MAXHEAP=5000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		heap=new int[MAXHEAP+1];
       Scanner sca= new Scanner(System.in);
       n=sca.nextInt();
       for(i=1;i<=n;i++){
    	   heap[i]=sca.nextInt();
    	   heap[i*2]=heap[i*2+1]=-1;
       }
       for(i=1;i<=n;i++){
    	   System.out.print("node "+i+": key = "+heap[i]+", ");
    	   if(i/2>0)System.out.print("parent key = "+heap[i/2]+", ");
    	   if(i*2<=n){
    		   System.out.print("left key = "+heap[i*2]+", ");
    	   }
       	   if(i*2+1<=n){
    		   System.out.print("right key = "+heap[i*2+1]+", ");
    	   }   
       	 System.out.println("");  
       }
	}

}

