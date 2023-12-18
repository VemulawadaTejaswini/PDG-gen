package AojLe04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Le04A {

	public static void main(String[] argc){
		Scanner scanner = new Scanner(System.in);
		int num=0;

		int numA = scanner.nextInt();
		List<Integer> listA = new ArrayList<Integer>();

		for(int i = 0; i < numA; i++){
			Integer wordA = scanner.nextInt();
			listA.add(wordA);
		}

		int numB = scanner.nextInt();
		List<Integer> listB = new ArrayList<Integer>();

		for(int i = 0; i < numB; i++){
			Integer wordB = scanner.nextInt();
			listB.add(wordB);
		}

		for(int i = 0; i < numA ; i++ ){
			for(int j = 0; j < numB; j++){
				if(listA.get(i).equals(listB.get(j))){
					num++;
				}
			}
		}

		System.out.println(num);
	}

}