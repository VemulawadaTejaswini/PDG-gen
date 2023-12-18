
import java.util.*;

public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		SortContext context = new SortContext(scan.nextInt(), new Bubble());
		context.readSequence(scan);
		scan.close();
		System.out.println(context);
		System.out.println(context.swapTimes());
	}

}

abstract class SortStrategy{
	int swapTimes = 0;
	int seqLength;
	int getSwapTimes(){
		return swapTimes;
	}
	abstract Iterator<Integer> sort(ArrayList<Integer> seq);
}
class Bubble extends SortStrategy{
	@Override
	public Iterator<Integer> sort(ArrayList<Integer> seq){
		for(int i=0; i<seq.size();i++)
			for(int j=seq.size()-1; i<j ;j--)
				if(seq.get(j)<seq.get(j-1)){
					Collections.swap(seq, j, j-1);
					swapTimes++;
				}
		return seq.iterator();
	}

}
/*
class Selection extends SortStrategy{
	public Selection(int n){
		super(n);
	}
	@Override
	public ArrayList<Integer> sort(){

}*/
class SortContext{
	SortStrategy strategy;
	ArrayList<Integer> seq = new ArrayList<Integer>();
	int seqLength;
	public SortContext(int length, SortStrategy s){
		seqLength = length;
		this.strategy = s;
	}
	public void readSequence(Scanner scan){
		for(int i=0; i<seqLength; i++)
			seq.add(scan.nextInt());
	}
	public String toString(){
		String tmp = "";
		for(Iterator<Integer> iter = strategy.sort(seq); iter.hasNext();)
			tmp += iter.next() + " ";
		return tmp.trim();
	}
	public int swapTimes(){
		return strategy.getSwapTimes();
	}
}