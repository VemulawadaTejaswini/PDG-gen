import java.io.*;
import java.util.*;
/*

BubbleSort(A)
1 for i = 0 to A.length-1
2     for j = A.length-1 downto i+1
3         if A[j] < A[j-1]
4             swap A[j] and A[j-1]

入力例 1
5
5 3 2 4 1


*/

public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		BubbleSort sort = new BubbleSort(scan.nextInt());
		sort.loadSequence(scan);
		scan.close();
		sort.sort();
		System.out.println(sort);
		System.out.println(sort.swapTimes);
	}

}
class BubbleSort extends Sorting{
	public BubbleSort(int n){
		super(n);
	}
	@Override
	public void sort(){
		for(int i=0; i<seq.length-1;i++)
			for(int j=seq.length-1; i<j ;j--)
				if(seq[j]<seq[j-1])
					swap(j,j-1);
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