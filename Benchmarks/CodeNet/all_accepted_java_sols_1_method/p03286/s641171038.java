import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if(N == 0){
			System.out.println(0);

		}
		else{
			Deque<Integer> stack = new ArrayDeque<Integer>();

			double tmp = 0;
			for(int i = 1 ; i <= 35 ; i++){
				double bek = Math.pow(-2, i);

				//System.out.println("i : " + i);
				if(N%bek==0){
					//System.out.print(0);
					stack.push(0);
				}
				else{
					if(tmp == 0){
					tmp = N-(bek/(-2));
					}
					else{
						tmp = tmp-(bek/(-2));
					}
					//System.out.println("tmp :" + tmp);
					if(tmp%bek == 0){
						//System.out.print(1);
						stack.push(1);
					}
					else{
						//System.out.print(0);
						stack.push(0);
						tmp = tmp+(bek/(-2));
					}
				}
			}
			int flag = 0;
			int ff = stack.size();
			//System.out.println(ff);
			for(int i = 0 ; i < ff ; i++){
				int a = stack.poll();
				if(flag == 0 && a == 0){
					continue;
				}else{
					System.out.print(a);
					flag++;
				}
			}
		}
	}
}