import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Vector<Vector<Integer>> vec = new Vector<>();
			int n = sc.nextInt();
			int q = sc.nextInt();
			int i, j;
			for(i = 0; i < n; i++) {
				vec.add(new Vector<>());
			}
			for(i = 0; i < q; i++) {
				int order_number = sc.nextInt();
				int t = sc.nextInt();
				switch(order_number) {
				case 0 :
					vec.get(t).add(sc.nextInt());
					break;
				case 1 :
					for(j = 0; j < vec.get(t).size(); j++) {
						if(j == vec.get(t).size() - 1) {
							System.out.print(vec.get(t).get(j));
						}else{
						    System.out.print(vec.get(t).get(j) + " ");
						}
					}
					System.out.println();
					break;
				case 2 :
					vec.get(t).clear();
					break;
				}
			}

		}
	}
}

