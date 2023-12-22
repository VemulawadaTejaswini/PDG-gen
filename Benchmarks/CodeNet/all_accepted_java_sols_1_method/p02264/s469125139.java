

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Deque<Integer> queue = new LinkedList<>();
		Deque<String> name = new LinkedList<>();
		
		int time = 0;
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			name.add(sc.next());
			queue.add(sc.nextInt());
		}
		
		while(queue.size()>0)
		{
			queue.addLast(queue.poll()-q);//减去
			name.addLast(name.poll());
			time += q; //时间累加
			if(queue.peekLast()<=0)
			{
				//以P2为例
				//P1 150 - 100 50 p1 50 time =100
				//p2 80 -20  -20+200 180
				time += queue.pollLast();
				System.out.println(name.pollLast()+" "+time);
			}
			
		}
		
		

		
	}
}

