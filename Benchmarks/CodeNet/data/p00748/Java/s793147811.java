import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static int sub(List<Integer> list, int n){
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		LinkedList<Integer> count = new LinkedList<Integer>();
		
		queue.add(n);
		count.add(0);
		
		while(!queue.isEmpty()){
			int cur = queue.poll();
			int co = count.poll();
			
			if(cur == 0){
				return co;
			}
			
			for(int i : list){
				if(i > cur){
					break;
				}
				
				queue.add(cur - i);
				count.add(co + 1);
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> odd_list = new ArrayList<Integer>();
		
		for(int i = 1; (i * (i + 1) * (i + 2))/6 < 1000000; i++){
			list.add((i * (i + 1) * (i + 2))/6);
			if(((i * (i + 1) * (i + 2))/6) % 2 == 1){
				odd_list.add((i * (i + 1) * (i + 2))/6);
			}
		}
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(sub(list,n) + " " + sub(odd_list,n));
		}
		
		
	}
}	