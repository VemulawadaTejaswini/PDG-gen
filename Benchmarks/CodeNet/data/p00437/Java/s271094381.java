import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();
			
			final int size = a + b + c;
			
			if(size == 0){
				break;
			}
			
			final int N = sc.nextInt();
			
			int[] answer = new int[size];
			Arrays.fill(answer, 2);
			
			LinkedList<Integer> a_list = new LinkedList<Integer>();
			LinkedList<Integer> b_list = new LinkedList<Integer>();
			LinkedList<Integer> c_list = new LinkedList<Integer>();
			LinkedList<Integer> answers = new LinkedList<Integer>();
			
			for(int i = 0; i < N; i++){
				final int a_part = sc.nextInt() - 1;
				final int b_part = sc.nextInt() - 1;
				final int c_part = sc.nextInt() - 1;
				
				final int ans = sc.nextInt();
				
				if(ans == 1){
					a_list.addFirst(a_part);
					b_list.addFirst(b_part);
					c_list.addFirst(c_part);
					answers.addFirst(ans);
				}else{
					a_list.addLast(a_part);
					b_list.addLast(b_part);
					c_list.addLast(c_part);
					answers.addLast(ans);
				}
			}
			
			while(!answers.isEmpty()){
				final int a_part = a_list.poll();
				final int b_part = b_list.poll();
				final int c_part = c_list.poll();
				
				final int ans = answers.poll();
				
				if(ans == 1){
					answer[a_part] = ans;
					answer[b_part] = ans;
					answer[c_part] = ans;
				}else{
					if(answer[a_part] == 1 && answer[b_part] == 1 && answer[c_part] == 2){
						answer[c_part] = 0;
					}else if(answer[a_part] == 1 && answer[b_part] == 2 && answer[c_part] == 1){
						answer[b_part] = 0;
					}else if(answer[a_part] == 2 && answer[b_part] == 1 && answer[c_part] == 1){
						answer[a_part] = 0;
					}
				}
			}
			
			for(int i = 0; i < size; i++){
				System.out.println(answer[i]);
			}
		}
		
	}
}