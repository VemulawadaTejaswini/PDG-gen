import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class Take{
		int cur,pos;
		LinkedList<Integer> list;
		
		public Take(int cur, int pos, LinkedList<Integer> list) {
			super();
			this.cur = cur;
			this.pos = pos;
			this.list = list;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<Integer> array = new ArrayList<Integer>(n);
			
			for(int i = 0; i < n; i++){
				array.add(sc.nextInt());
			}
			Collections.sort(array, Collections.reverseOrder());
			//System.out.println(array);
			
			LinkedList<Take> list = new LinkedList<Take>();
			
		
			int count = 0;
			while(true){
				int cur = 0;
				boolean update = false;
				list.clear();
				
				list.add(new Take(0,0, new LinkedList<Integer>()));
				Take ans = null;
				
				while(!list.isEmpty()){
					Take take = list.poll();
					
					if(take.cur == 10){
						update = true;
						ans = take;
						break;
					}else if(take.pos + 1 <= array.size()){
						if(take.cur + array.get(take.pos) <= 10){
							LinkedList<Integer> tmp =  new LinkedList<Integer>(take.list);
							tmp.add(take.pos);
							list.add(new Take(take.cur + array.get(take.pos), take.pos + 1, tmp));
						}
						list.add(new Take(take.cur, take.pos + 1, new LinkedList<Integer>(take.list)));
					}
				}
				
				if(!update){
					break;
				}
				
				/*
				System.out.println(array);
				for(int i : list){
					System.out.print(array.get(i) + " ");
				}
				System.out.println();
				*/
				
				count++;
				while(!ans.list.isEmpty()){
					array.remove((int) ans.list.pollLast());
				}
			}
			
			System.out.println(count);
			
		}
	}

}