import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 標準入力からデータを読み込む準備
	try(Scanner sc = new Scanner(System.in)){
 
		int[] counter = new int[128];

		while(sc.hasNext()){
			 String str = sc.nextLine().toLowerCase();
			 for(int I =0; I < str.length(); I++){
				counter[str.charAt(I)]++;
			 }
		}

		for(char ch='a';ch<='z';ch++){
			System.out.println(ch + " : "+ counter[ch]);
		}

	}
	}

}
