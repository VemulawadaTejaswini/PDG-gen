import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer> array = new ArrayList<>();

		for(int i=0;i<N;i++) {

			int b = sc.nextInt();

			array.add(b);

		}

		if(array.get(0) != 1) System.out.println(-1);

		else {

			ArrayList<Integer> ans = new ArrayList<>();

			int count = 0;

			boolean flag;

			while(count<N) {

				flag = false;

				for(int i=array.size()-1;i>0;i--) {

					if(array.get(i) == i+1) {

						ans.add(i+1);

						array.remove(i);

						flag = true;

						break;
					}
				}

				if(!flag &&array.size()>1) {

					if(array.get(1) == 1) {

						ans.add(1);

						array.remove(1);

						//continue;
					}
				}
				count++;
			}

			if(ans.size()==N-1 && array.get(0)==1){

				System.out.println(1);

				for(int i=ans.size()-1;i>=0;i--) {

					System.out.println(ans.get(i));
				}
			}else {

				System.out.println(-1);
			}
		}
	}

}
