import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int top    = sc.nextInt();
		int front  = sc.nextInt();
		int left   = sc.nextInt();
		int right  = sc.nextInt();
		int back   = sc.nextInt();
		int bottom = sc.nextInt();
		
		HashMap<Integer, HashMap<Integer, Integer>> dice = new HashMap<Integer, HashMap<Integer, Integer>>();
		dice.put(top, new HashMap<Integer, Integer>());
		dice.put(front, new HashMap<Integer, Integer>());
		dice.put(left, new HashMap<Integer, Integer>());
		dice.put(right, new HashMap<Integer, Integer>());
		dice.put(back, new HashMap<Integer, Integer>());
		dice.put(bottom, new HashMap<Integer, Integer>());
		dice.get(top).put(front, left);
		dice.get(top).put(left, back);
		dice.get(top).put(back, right);
		dice.get(top).put(right, front);
		dice.get(front).put(bottom, left);
		dice.get(front).put(left, top);
		dice.get(front).put(top, right);
		dice.get(front).put(right, bottom);
		dice.get(bottom).put(back, left);
		dice.get(bottom).put(left, front);
		dice.get(bottom).put(front, right);
		dice.get(bottom).put(right, back);
		dice.get(back).put(top, left);
		dice.get(back).put(left, bottom);
		dice.get(back).put(bottom, right);
		dice.get(back).put(right, top);
		dice.get(left).put(top, front);
		dice.get(left).put(front, bottom);
		dice.get(left).put(bottom, back);
		dice.get(left).put(back, top);
		dice.get(right).put(front, top);
		dice.get(right).put(top, back);
		dice.get(right).put(back, bottom);
		dice.get(right).put(bottom, front);
		
		final int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			System.out.println(dice.get(a).get(b));
			
		}
		
	}
}