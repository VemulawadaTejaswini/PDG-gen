import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<num;i++)
			list.add(scan.next());
		scan.close();
		BubbleSort bs = new BubbleSort(num);
		SelectionSort ss = new SelectionSort(num);
		bs.loadSequence((String[])list.toArray(new String[0]));
		ss.loadSequence((String[])list.toArray(new String[0]));
		bs.sort();
		ss.sort();
		System.out.println(bs);
		System.out.println("Stable");
		System.out.println(ss);
		if(bs.isStable(ss))
			System.out.println("Stable");
		else
			System.out.println("Not stable");
	//	System.out.println(sort.swapTimes);
	}

}

class BubbleSort extends SortingCards{
	public BubbleSort(int n){
		super(n);
	}

	@Override
	public void sort(){
		for(int i=0; i<this.length;i++)
			for(int j=this.length-1; i<j ;j--)
				if(sortList.get(j).compValue()<sortList.get(j-1).compValue())
					swap(j,j-1);
	}
	boolean isStable(Sorting sort){
		for(int i=0; i<this.length;i++)
			if(this.sortList.get(i).toString().equals(sort.sortList.get(i).toString()))
				return false;
		return true;
	}	
}

class SelectionSort extends SortingCards{
	public SelectionSort(int n){
		super(n);
	}
	@Override
	public void sort(){
		for(int i=0; i<this.length;i++){
			int minIndex=i;
			for(int j=i; j<this.length;j++){
				if(sortList.get(j).compValue()<sortList.get(minIndex).compValue())
					minIndex = j;
			}
			if(i!=minIndex)
				swap(i,minIndex);
		}
	}	
}


interface comparable{
	int compValue();
}
class SortingCards extends Sorting{
	public SortingCards(int n){
		super(n);
	}
	@Override
	public void loadSequence(String[] str){
		for(int i=0; i<this.length;i++)
			sortList.add(new cards(str[i]));
	}
	@Override
	public void sort(){};
}
class cards implements comparable{
	char type;
	Integer number;
	public cards(String str){
		type = str.charAt(0);
		number = Integer.parseInt(str.substring(1,str.length()));		
	}
	public int compValue(){
		return number;
	}
	@Override
	public String toString(){
		return type + number.toString();
	}
}
abstract class Sorting{
	int swapTimes;
	int length;
	ArrayList<comparable> sortList;
	public Sorting(int n){
		swapTimes=0;
		length=n;
		sortList = new ArrayList<comparable>();
	}
	
	@Override
	public String toString(){
		String tmp = "";
		for(int i=0; i<length; i++)
			tmp = tmp + " " + sortList.get(i);
		return tmp.trim();
	}
	void swap(int i, int j){
		swapTimes++;
		comparable tmp = sortList.set(i,sortList.get(j));
		sortList.set(j,tmp);
	}
	abstract public void loadSequence(String[] str);
	//abstract public void loadSequence(Scanner scan);
	abstract public void sort();
}