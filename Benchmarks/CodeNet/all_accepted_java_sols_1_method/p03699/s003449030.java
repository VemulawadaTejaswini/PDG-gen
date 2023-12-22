import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> scores = new LinkedList<>();
		
		// input
		final int NUM = scan.nextInt();
		int sum = 0;
		for(int i = 0; i < NUM; i++){
			int temp = scan.nextInt();
			scores.add(temp);
			sum += temp;
		}
		
		// sort
		Collections.sort(scores);
		
		// search
		int count = 0;
		while(sum % 10 == 0 && scores.size() > 0){
			if((sum - scores.peek()) % 10 != 0){
				sum -= scores.poll();
			} else {
				scores.add(scores.poll());
			}
			count++;
			if(count == NUM){
				break;
			}
		}
		
		// answer
		if(sum % 10 == 0){
			System.out.println(sum % 10);
		} else {
			System.out.println(sum);
		}
		
	}
}