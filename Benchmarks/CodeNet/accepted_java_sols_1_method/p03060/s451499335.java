import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int index = sc.nextInt();
		int V = 0;
		int C = 0;
		int[] value = new int[index];
		int[] cost = new int[index];
		
		for(int i = 0;i<index;i++) {
			value[i] = sc.nextInt();
		}
		for(int i = 0;i<index;i++) {
			cost[i] = sc.nextInt();
		}
		for(int i = 0;i<index;i++) {
			if(value[i] > cost[i]) {
				V += value[i];
				C += cost[i];
			}
		}
		System.out.println(V-C);
		
	}

}
