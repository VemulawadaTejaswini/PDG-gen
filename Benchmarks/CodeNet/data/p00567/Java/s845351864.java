import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){
		int n, i, j, sum = 0, subsum = 0, floor, ceiling, number = 0, nearestPrime, max, min, box, calcu;
		int[] a = new int[51];
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			TreeSet<Integer> ts = new TreeSet<Integer>();
			for(i = 0; i < n; i++) {
				sum += sc.nextInt();
				ts.add(sum);
				
			}
			
			for(i = 2; i < n; i++) {
				subsum = sum;
				nearestPrime = 0;
				max = 0;
				min = 1000;
				for(j = 1; j < i; j++) {
					number = sum * j / i;
					ceiling = ts.ceiling(number);
					floor = ts.floor(number);
					box = nearestPrime;
					nearestPrime = number - floor <= ceiling - number ? floor : ceiling;
					calcu = nearestPrime - box;
					if(max < calcu) {
						max = calcu;
					}
					if(min > calcu) {
						min = calcu;
					}
				}
				
				subsum = sum - nearestPrime;
				if(max < subsum) {
					max = subsum;
				}
				if(min > subsum) {
					min = subsum;
				}
				a[i] = max - min;
			}
			min = 1000;
			for(j = 2; j < i; j++) {
				if(min > a[j]) {
					min = a[j];
				}
			}
			System.out.println(min);
		}
	}
}

