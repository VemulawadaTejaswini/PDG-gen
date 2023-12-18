import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer D = sc.nextInt();
		Integer N = sc.nextInt();

		List<Integer> ansList = new ArrayList<>();
		if (D == 0) {
			for(int i=1; i<=99; i++) {
				ansList.add(i);
			}
			ansList.add(101);
		} else if (D == 1) {
			for(int i=1; i<=99; i++) {
				ansList.add(i * 100);
			}
			ansList.add(10100);
		} else {
			for(int i=1; i<=99; i++) {
				ansList.add(i * 10000);
			}
			ansList.add(1010000);
		}

		System.out.println(ansList.get(N-1));


	}

}
