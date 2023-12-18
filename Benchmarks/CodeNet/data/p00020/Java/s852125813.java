

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char array[] = str.toCharArray();
		for(int i=0; i < array.length; i++){
			if(array[i] == ' ' || array[i] == '.')
				System.out.print(array[i]);
			else{
				array[i] += 'A'-'a';
				System.out.print(array[i]);
			}
		}

		System.out.println();
	}

}