import java.io.*;
import java.util.*;

public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		SelectionSort sort = new SelectionSort(scan.nextInt());
		sort.loadSequence(scan);
		scan.close();
		sort.sort();
		System.out.println(sort);
		System.out.println(sort.swapTimes);
	}

}
class SelectionSort extends Sorting{
	public SelectionSort(int n){
		super(n);
	}
	@Override
	public void sort(){
		
		/*SelectionSort(A)
1 for i = 0 to A.length-1
2     mini = i
3     for j = i to A.length-1
4         if A[j] < A[mini]
5             mini = j
6     swap A[i] and A[mini]*/
		for(int i=0; i<seq.length-1;i++){
			int minIndex=i;
			for(int j=i; j<seq.length-1;j++)
				if(seq[j]<seq[minIndex])
					minIndex = j;
			if(i!=minIndex)
				swap(i,minIndex);
		}
	}	
}
abstract class Sorting{
	int swapTimes;
	int[] seq;
	public Sorting(int n){
		swapTimes=0;
		seq = new int[n];
	}
	public void loadSequence(Scanner scan){
		for(int i=0; i<seq.length; i++)
			seq[i] = scan.nextInt();
	}
	@Override
	public String toString(){
		String tmp = "";
		for(int i=0; i<seq.length; i++)
			tmp = tmp + " " + seq[i];
		return tmp.trim();
	}
	void swap(int i, int j){
		swapTimes++;
		int tmp = seq[i];
		seq[i] = seq[j];
		seq[j] = tmp;
	}
	abstract public void sort();
}