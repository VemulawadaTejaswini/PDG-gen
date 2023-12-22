import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[100];
		for(int i = 0; i < 100; i++) {
			data[i] = 0;
		}
		
		int tmp;
		while(sc.hasNext()) {
			tmp = sc.nextInt();
			data[tmp - 1]++;
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 100; i++) {
			max = Math.max(max, data[i]);
		}
		
		for(int i = 0; i < 100; i++) {
			if(data[i] == max)	System.out.println(i + 1);
		}
	}
}