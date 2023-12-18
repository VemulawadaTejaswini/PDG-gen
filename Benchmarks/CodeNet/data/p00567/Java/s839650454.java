import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){
		int n, i, j, max, min, calcu;
		double sum = 0, subsum = 0, number = 0, nearestPrime, box = 0, floor = 0, ceiling = 0;
		int[] a = new int[51];
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			TreeSet<Double> ts = new TreeSet<Double>();
			for(i = 0; i < n; i++) {
				sum += sc.nextInt();
				ts.add(sum);
			}
			loop : for(i = 2; i <= n; i++) {
				subsum = sum;
				nearestPrime = 0;
				max = 0;
				min = 50000;
				for(j = 1; j < i; j++) {
					number = sum * j / i;
					if(ts.ceiling(number) != null && ts.floor(number) != null) {
						ceiling = ts.ceiling(number);
						floor = ts.floor(number);
					}else {
						break loop;
					}
					box = nearestPrime;
					if(number - floor <= ceiling - number) {
						nearestPrime = floor;
					}else {
						nearestPrime = ceiling;
					}
					
					calcu = (int) (nearestPrime - box);
					if(max < calcu) {
						max = calcu;
					}
					if(min > calcu) {
						min = calcu;
					}
				}
				subsum = sum - nearestPrime;
				if(max < subsum) {
					max = (int) subsum;
				}
				if(min > subsum) {
					min = (int) subsum;
				}
				a[i] = max - min;
			}
			min = 50000;
			for(j = 2; j < i; j++) {
				if(min > a[j]) {
					min = a[j];
				}
			}
			System.out.println(min);
		}
	}
}
