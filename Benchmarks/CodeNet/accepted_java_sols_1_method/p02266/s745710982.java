import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> stack = new ArrayDeque<>();
		Deque<Integer> position = new ArrayDeque<>();
		Deque<Integer> mizutamari = new ArrayDeque<>();
		char[] area = sc.nextLine().toCharArray();
		int sum=0;
		int mizu;


		for(int i=0; i<area.length; i++) {
			if(area[i]=='\\') {
				stack.push(i);
			}else if(area[i]=='/'&&stack.size()>0) {
				int j =stack.pop();
				mizu =i-j;
				sum += mizu;
				while(position.size()>0&&position.peek()>j) {
					mizu +=mizutamari.pop();
					position.pop();
				}
				position.push(j);
				mizutamari.push(mizu);
			}
		}
		int count = position.size();
		int[] ans = new int[count];
		System.out.println(sum);
		System.out.print(count);
		for(int i=count-1; i>=0; i--) {
		   ans[i]=mizutamari.pop();
		}
		for(int i=0; i<count; i++) {
			System.out.print(" "+ans[i]);
		}
        System.out.println();

	}
}

