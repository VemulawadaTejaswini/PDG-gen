import java.util.*;

public class Main{
	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		String[] words = new String[NUM];
		for(int i = 0; i < NUM; i++){
			String input = scan.next();
			char[] inputChar = input.toCharArray();
			Arrays.sort(inputChar);
			words[i] = new String(inputChar);
		}
		Arrays.sort(words);
		
		//check
		String memory = words[0];
		long count =1;
		long answer = 0;
		for(int i = 1; i < NUM; i++){
			if(memory.equals(words[i])){
				count++;
			} else {
				answer += count * (count - 1) / 2;
				memory = words[i];
				count =1;
			}
		}
		if(count >= 2){
			answer += count * (count - 1) / 2;
		}
		
		System.out.println(answer);
	}
}