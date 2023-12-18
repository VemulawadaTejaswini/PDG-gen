import java.util.Scanner;
public class Main{
	static int[]heap;
    static int MAXHEAP=2000000;
    static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		heap=new int[MAXHEAP+1];
       Scanner sca= new Scanner(System.in);
       n=sca.nextInt();
       for(i=1;i<=n;i++){
    	   heap[i]=sca.nextInt();
    	   heap[i*2]=heap[i*2+1]=Integer.MIN_VALUE;
       }
       buildMaxHeap();
       for(i=1;i<=n;i++){
      System.out.print(" "+heap[i]);
      if(i==n)System.out.println("");
       }
	}
	public static void maxHeapify(int i){
		int l=i*2,r=i*2+1,largest,hz;
		if(i<=n&&heap[l]>heap[i]){
			largest=l;
		}else{
			largest=i;
		}
		if(r<=n&&heap[r]>heap[largest])largest=r;
		if(largest!=i){
			hz=heap[largest];
			heap[largest]=heap[i];
			heap[i]=hz;
			maxHeapify(largest);
		}
	}
	public static void buildMaxHeap(){
		int i;
		for(i=n/2;i>=1;i--){
			maxHeapify(i);
		}
	}

}

