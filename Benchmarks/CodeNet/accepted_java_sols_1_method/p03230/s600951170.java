import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = 1;
		while(k*(k-1)/2<n) {
			k++;
		}
		if(k*(k-1)/2==n) {
			System.out.println("Yes");
			List<List<Integer>> s = new ArrayList<>();
			for(int i=0;i<k;i++) {
				List<Integer> list = new ArrayList<>();
				s.add(list);
			}
			int num = 1;
			int listCounter1 = 0;
			int listCounter2 = 1;
			while(num<=n) {
				s.get(listCounter1).add(num);
				s.get(listCounter2).add(num);
				listCounter2++;
				if(listCounter2==k) {
					listCounter1++;
					listCounter2 = listCounter1 + 1;
				}
				num++;
			}
			
			System.out.println(k);
			for(int i=0;i<k;i++) {
				System.out.print(k-1);
				List<Integer> list = s.get(i);
				for(int j=0;j<k-1;j++) {
					System.out.print(" "+list.get(j));
				}
				System.out.println();
			}
		}else {
			System.out.println("No");
		}
		in.close();
	}

}
