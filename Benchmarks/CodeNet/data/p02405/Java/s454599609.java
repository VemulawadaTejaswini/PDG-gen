import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<>();
		
		int H = 999;
		int W = 999;
		
		int cnt = 0;
		
		//?????????????´?
		while(H != 0 || W != 0) {
			H = sc.nextInt();
			W = sc.nextInt();
			if(H == 0 && W == 0) {
				break;
			} else {
				ll.add(H);
				ll.add(W);
				cnt+=2;
			}
		}
		
		int k = 0;
		while(k < cnt) {
			int j = 0;
			while(j < ll.get(k)) {
				int i = 0;
				while(i < ll.get(k+1)) {
					if(j % 2 == 0 && i % 2 == 0
					|| j % 2 != 0 && i % 2 != 0) {
						System.out.print("#");
					} else if(j % 2 == 0 && i % 2 != 0
						   || j % 2 != 0 && i % 2 == 0) {
						System.out.print(".");
					}
					i++;
				}
				System.out.println();
				j++;
			}
			System.out.println();
			k+=2;
		}
		
	}
}