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
					if(j == 0 || j == ll.get(k) - 1
					 ||i == 0 || i == ll.get(k+1) - 1) {
						System.out.print("#");
					} else {
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