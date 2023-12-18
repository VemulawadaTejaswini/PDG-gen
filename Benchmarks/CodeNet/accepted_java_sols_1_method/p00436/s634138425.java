import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		final int n = sc.nextInt();
		
		for(int i = 1; i <= 2*n; i++){
			list.add(i);
		}
		
		final int m = sc.nextInt();
		
		for(int i = 0; i < m; i++){
			final int ops = sc.nextInt();
			
			if(ops == 0){
				LinkedList<Integer> lf1 = new LinkedList<Integer>();
				LinkedList<Integer> lf2 = new LinkedList<Integer>();
				
				int count = 0;
				for(ListIterator<Integer> iter = list.listIterator(); iter.hasNext();){
					if(count / n == 0){
						lf1.add(iter.next());
					}else{
						lf2.add(iter.next());
					}
					count++;
				}
				
				list.clear();
				for(int j = 0; j < 2*n; j++){
					if(j % 2 == 0){
						list.add(lf1.poll());
					}else{
						list.add(lf2.poll());
					}
				}
			}else{
				for(int j = 0; j < ops; j++){
					list.addLast(list.poll());
				}
			}
		}
		
		for(int i : list){
			System.out.println(i);
		}

	}

}