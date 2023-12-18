
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] num=new int[n+1];
		for(int i=1;i<=n;i++){
			num[i]=scan.nextInt();
		}
		for(int i=n/2;i>0;i--){
			maxHeap(num,i);
		}
		for(int i=1;i<=n;i++){
			System.out.print(" "+num[i]);
		}
		System.out.println();
	}

	private static void maxHeap(int[] num, int i) {
		// TODO Auto-generated method stub
		int l=2*i;
		int r=2*i+1;
		int H=num.length-1;
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

