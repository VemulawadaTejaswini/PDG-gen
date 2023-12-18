import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			//HashSet<ArrayList<Integer>> hash = new HashSet<ArrayList<Integer>>();
			//pre(0, 9, new ArrayList<Integer>(), hash);
			//System.out.println(hash);
			
			ArrayList<Integer> array = new ArrayList<Integer>(n);
			
			for(int i = 0; i < n; i++){
				array.add(sc.nextInt());
			}
			Collections.sort(array, Collections.reverseOrder());
			//System.out.println(array);
			
			LinkedList<Integer> list = new LinkedList<Integer>();
		
			int count = 0;
			while(true){
				int cur = 0;
				boolean update = false;
				list.clear();
				
				for(int i = 0; i < array.size(); i++){
					if(cur == 10){
						update = true;
						break;
					}else if(cur + array.get(i) <= 10){
						cur += array.get(i);
						list.add(i);
					}
				}
				if(cur == 10){
					update = true;
				}
				/*
				for(int i : list){
					System.out.print(array.get(i) + " ");
				}
				System.out.println();
				*/
				if(!update){
					break;
				}
				
				count++;
				while(!list.isEmpty()){
					array.remove((int) list.pollLast());
				}
			}
			
			System.out.println(count);
			
		}
	}

}