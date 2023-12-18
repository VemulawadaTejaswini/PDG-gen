import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int numInteger = scan.nextInt();
		MergeSort<Integer> sort = new MergeSort<Integer>();
		for(int i=0 ;i<numInteger ;i++)
			sort.add(scan.nextInt());
		sort.mergeSort(0, sort.size()-1);
		System.out.println(sort.getList());
		System.out.println(sort.getCount());	
	}
}
class MergeSort<T extends Comparable<T>> extends ArrayList<T>{
		ArrayList<T> leftList = new ArrayList<T>();
		ArrayList<T> rightList = new ArrayList<T>();
		int countComparision = 0;
	public void mergeSort(int left, int right){
		if(left >= right)
			return;
    	int mid = (left + right) / 2;
		mergeSort(left, mid);
		mergeSort(mid + 1, right);
		merge(left, mid, right);
	}
	void merge(int left, int mid, int right){
		addTempList(leftList, left, mid - left + 1);
		addTempList(rightList, mid + 1 , right - mid);
		for(int k = left; k <= right; k++){
			if(leftList.isEmpty())
				this.set(k, rightList.remove(0));
			else if(rightList.isEmpty())
				this.set(k, leftList.remove(0));
			else{
				T tmpLeft = leftList.get(0);
				T tmpRight = rightList.get(0);
				this.set(k, (tmpLeft.compareTo(tmpRight)<0) ?
					leftList.remove(0) : rightList.remove(0));
			}
			countComparision++;
		}
	}
	void addTempList(ArrayList<T> list, int from, int count){
		list.clear();
		for(int i=0; i<count; i++)
			list.add(this.get(from + i));
	}
	public String getList(){
		String tmp="";
		for(T t : this)
			tmp += t + " ";
		return tmp.trim();	
	}
	public int getCount(){
		return countComparision;	
	}
}