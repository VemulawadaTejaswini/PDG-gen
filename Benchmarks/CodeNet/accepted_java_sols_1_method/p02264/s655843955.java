import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		Deque<String> name_stack = new ArrayDeque<>();
		Deque<Integer> time_stack = new ArrayDeque<>();
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		String nothing = scanner.nextLine();
		int all_time = 0;

		for(int i = 0; i < n-1; i++){
			name_stack.offer(scanner.next());
			time_stack.offer(scanner.nextInt());
			nothing = scanner.nextLine();
		}
		
		name_stack.offer(scanner.next());
		time_stack.offer(scanner.nextInt());

		while(!(name_stack.isEmpty())){
			String name = name_stack.poll();
			int time = time_stack.poll();

			if(time <= q){
				all_time += time;
				System.out.println(name + " " + all_time);
			}else{
				all_time += q;
				time -= q;
				name_stack.offer(name);
				time_stack.offer(time);
			}
		}

	}
}