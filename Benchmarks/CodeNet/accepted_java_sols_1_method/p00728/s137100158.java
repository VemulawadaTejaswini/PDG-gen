import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int min, max, num, sum;
		while(true) {
			n = sc.nextInt();
			if(n == 0) return;
			sum = 0;
			min = 1001;
			max = -1;
			for(int i = 0; i < n; i++) {
				num = sc.nextInt();
				if(min > num)min = num;
				if(max < num)max = num;
				sum += num;
			}
			sum -= min+ max;
			System.out.println(sum / (n - 2));
		}
	}
}

