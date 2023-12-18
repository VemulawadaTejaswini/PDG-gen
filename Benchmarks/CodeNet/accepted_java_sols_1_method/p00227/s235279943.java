import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			for(int i = 0; i < n; i++){
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);
			Collections.reverse(list);

			int cost = 0;
			
			while(list.size() >= m){
				for(int i = 0; i < (m - 1); i++){
					cost += list.poll();
				}
				list.poll();
			}
			
			if(!list.isEmpty()){
				for(int i : list){
					cost += i;
				}
			}
			
			System.out.println(cost);
		}
		
	}
}