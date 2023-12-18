import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> univW = new ArrayList<>();
		List<Integer> univK = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			univW.add(sc.nextInt());
		}
		
		for(int i = 0; i < 10; i++) {
			univK.add(sc.nextInt());
		}
		
		Collections.sort(univW);
		Collections.sort(univK);
		Collections.reverse(univW);
		Collections.reverse(univK);
		
		int sumW = 0, sumK = 0;
		
		for(int i = 0; i < 3; i++) {
			sumW+=univW.get(i);
			sumK+=univK.get(i);
		}
		
		System.out.println(sumW + " " + sumK);
	}
}