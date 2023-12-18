import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();

		List<Integer> towerList = new ArrayList();
		int gap = b-a;
		int height = 1;
		for(int i=2; i<1000; i++) {
			towerList.add(height);
			height = height + i;
		}

		System.out.println(towerList.get(gap-2)- a);
	}

}

