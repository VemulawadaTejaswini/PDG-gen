import java.util.Scanner;
public class Main{
	static int[]heap;
    static int MAXHEAP=2000000;
    static int n=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i;
	    String hz;
		heap=new int[MAXHEAP+1];
       Scanner sca= new Scanner(System.in);
       while(true){
	   hz=sca.next();
	   if(hz.equals("insert")){
	    maxHeapInsert(sca.nextInt());
	   }else if(hz.equals("extract")){
	       System.out.println(extract());
	   }else if(hz.equals("end")){
	    break;
	   }
       }
	}
	public static void maxHeapify(int i){
		int l,r,largest,hz;
		l=i*2;
		r=i*2+1;
		if(l<=n&&heap[l]>heap[i]){
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
    public static void maxHeapInsert(int key){
	n++;
	heap[n]=Integer.MIN_VALUE;
	heapIncreaseKey(n,key);
    }
    public static void heapIncreaseKey(int i,int key){
	int hz;
       	if (key<heap[i])return;
	heap[i]=key;
	while(i>1&&heap[i/2]<heap[i]){
	    hz=heap[i/2];
	    heap[i/2]=heap[i];
	    heap[i]=hz;
	    i/=2;
	}
    }
    public static int extract(){
	int i,max;
	if(n<1)return Integer.MIN_VALUE;
	max=heap[1];
	heap[1]=heap[n];
	n--;
	maxHeapify(1);
	return max;
    }

}

