
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int length;
		BubbleSort bs = new BubbleSort(length=scan.nextInt());
		for(int i=0; i<length;i++)
			bs.Load(i,scan.nextInt());
		bs.show();
	}
}
class BubbleSort{
	int[] seq;
	int SwapCount;
	public BubbleSort(int length){
		seq=new int[length];
		SwapCount=0;
	}
	public void Load(int i,int num){
		seq[i]=num;
	}
	void Swap(int x, int y){
		int tmp=seq[x];
		seq[x]=seq[y];
		seq[y]=tmp;
		SwapCount++;
	}
	void Sort(){
		for(int i=0; i<seq.length;i++)
			for(int j=seq.length-1; j>i;j--)
				if(seq[j]<seq[j-1])
					Swap(j,j-1);
	}
	public void show(){
		Sort();
		for(int i=0;i<seq.length;i++)
			System.out.printf("%d ",seq[i]);
		System.out.printf("\n%d\n",SwapCount);
	}
}