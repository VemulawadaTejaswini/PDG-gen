

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		int p;

		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0 ; i<100 ; i++) {
			array.add(i+1);
		}

		for(int i=0; i<n; i++) {
			p = sc.nextInt();
			array.set(p-1, 0);
			//array.remove(p-1);
		}
		sc.close();

		if(n == 0) {
			System.out.println(x);
			return;
		}

		Collections.sort(array);


		for(int i=0 ; i<array.size()-1 ; i++) {
			int a = Math.abs(x - array.get(i));
			int b = Math.abs(x - array.get(i + 1));
			if(array.get(i+1)==0) {b = -1;}
			if(a < b){
				System.out.println(array.get(i));
				break;
			}
			if(a == b && a !=0) {
				System.out.println(array.get(i));
				break;
			}

		}


	}

}
