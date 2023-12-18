

import java.util.Scanner;

public class Main {

	static int[] A=new int[2000001];
	static int H=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		while(true){
			String str=scanner.next();
			if(str.equals("insert")){
				insert(scanner.nextInt());
			}else if(str.equals("extract")){
				System.out.println(extract());
			}else if(str.equals("end")){
				break;
			}
		}
		
	}
	private static int extract() {
		// TODO Auto-generated method stub
		if(H<1)
			return 0;
		int max=A[1];
		A[1]=A[H];
		H--;
		maxHeap(A, 1);
		return max;
	}
	//插入方法需要掌握
	private static void insert(int key) {
		// TODO Auto-generated method stub
		H++;
		A[H]=Integer.MIN_VALUE;
		if(key<A[H])
			return;
		A[H]=key;
		int i=H;
		while(i>1&&A[i/2]<A[i]){
			swap(A, i/2, i);
			i=i/2;
		}
	}

	private static void maxHeap(int num[], int i) {
		// TODO Auto-generated method stub
		int l=2*i;
		int r=2*i+1;
		
		int largest=-1;
		if(l<=H&&num[l]>num[i]){
			largest=l;
		}else {
			largest=i;
		}
		if(r<=H&&num[r]>num[largest])
			largest=r;
		
		if(largest!=i){
			swap(num,largest,i);
			maxHeap(num, largest);
		}
	}
	private static void swap(int[] num, int j, int i) {
		// TODO Auto-generated method stub
		int tmp=num[i];
		num[i]=num[j];
		num[j]=tmp;
	}
}

