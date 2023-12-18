
import java.util.Scanner;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.*;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		SortStrategy bubble = new Bubble(scan.nextInt());
		bubble.loadSequence(scan);
		scan.close();
		SortContext context = new SortContext(bubble);
		System.out.println(context);
		System.out.println(context.swapTimes());
	}

}

abstract class SortStrategy{
	int swapTimes = 0;
	int seqLength;
	ArrayList<Integer> seq = new ArrayList<Integer>();
	public SortStrategy(int n){
		seqLength = n;
	}
	public void loadSequence(Scanner scan){
		for(int i=0; i<seqLength; i++)
			seq.add(scan.nextInt());
	}
	int getSwapTimes(){
		return swapTimes;
	}
	abstract ArrayList<Integer> sort();
}
class Bubble extends SortStrategy{
	public Bubble(int n){
		super(n);
	}
	@Override
	public ArrayList<Integer> sort(){
		for(int i=0; i<seq.size();i++)
			for(int j=seq.size()-1; i<j ;j--)
				if(seq.get(j)<seq.get(j-1)){
					Collections.swap(seq, j, j-1);
					swapTimes++;
				}
		return seq;
	}

}
class SortContext{
	SortStrategy strategy;
	public SortContext(SortStrategy s){
		this.strategy = s;
	}
	public String toString(){
		String tmp = "";
		for(Iterator<Integer> iter = strategy.sort().iterator();iter.hasNext();)
			tmp += iter.next() + " ";
		return tmp.trim();
	}

	public int swapTimes(){
		return strategy.getSwapTimes();
	}
}