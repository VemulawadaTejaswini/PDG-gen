

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		int k = sc.nextInt();
		boolean oneChar = true;
		for(int i = 1; i < str.length; i++){
			if(str[i - 1] != str[i]){
				oneChar = false;
				break;
			}
		}

		if(oneChar){
			System.out.println((long)str.length*k/2);
			return;
		}

		int firstSeq = 0;
		int lastSeq = 0;
		int tmpCount = 0;
		int changeCount = 0;
		for(int i = 0; i < str.length; i++){
			tmpCount++;

			if(i == str.length - 1 || str[i] != str[i + 1]){
//				System.out.println("index " + i);
				changeCount += tmpCount/2;

				lastSeq = tmpCount;
				if(firstSeq == 0){
					firstSeq = tmpCount;
				}

				tmpCount = 0;
			}
		}

//		System.out.println(firstSeq + " " + lastSeq);
		long result = (long)changeCount*k;

		if(str[0] == str[str.length - 1]){
			result = result - (long)(firstSeq/2 + lastSeq/2 - (firstSeq + lastSeq)/2)*(k - 1);
		}

		System.out.println(result);
	}

}
