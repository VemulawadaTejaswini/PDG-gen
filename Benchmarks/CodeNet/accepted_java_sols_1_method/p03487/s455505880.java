import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> nums = new LinkedList<>();
		
		// input
		int num = scan.nextInt();
		for(int i = 0; i < num; i++){
			nums.add(scan.nextInt());
		}
		
		// sort
		Collections.sort(nums);
		
		// search
		int answer = 0;
		int count = 1;
		int memory = nums.poll();
		while(nums.size() > 0){
			if(memory != nums.peek()){
				if(count > memory){
					answer += count - memory;
				} else if (count < memory){
					answer += count;
				}				
				count = 1;
				memory = nums.poll();
			} else {
				nums.poll();
				count++;
			}
		}
		if(count > memory){
			answer += count - memory;
		} else if (count < memory){
			answer += count;
		}		
		
		// answer
		System.out.println(answer);
		
	}
}