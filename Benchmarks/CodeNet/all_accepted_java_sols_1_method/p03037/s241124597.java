import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int card = sc.nextInt();
		int gate = sc.nextInt();
		int count = 0;
		int flag = 0;
		ArrayList<Integer> array = new ArrayList<Integer>(10000);
		for (int i = 0; i < gate * 2; i++) {
			array.add(sc.nextInt());
		}
		int max=0;
			for(int i=0;i<gate*2;i+=2) {
				if(array.get(i)>=max) max=array.get(i);
			}

		int min=array.get(1);
			for(int i=1;i<gate*2;i+=2) {
				if(array.get(i)<=min) min=array.get(i);
			}

			for(int i=1;i<=card;i++) {
				if(i>=max&&i<=min) {
					count++;
				}
			}


		System.out.println(count);

	}
}

