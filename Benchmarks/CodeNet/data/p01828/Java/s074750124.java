
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		char[][] strs = new char[2][];
		strs[0] = sc.next().toCharArray();
		strs[1] = sc.next().toCharArray();

loop:		for(int i = 0; i <= 1; i++){
			int[] indexes = {0,0};
			int current = i;
			for(int j = 0; j < strs[0].length; j++){
				while(strs[current][indexes[current]] != strs[0][j]){
					indexes[current]++;
					if(indexes[current] == strs[0].length){
						continue loop;
					}
				}
				indexes[current]++;
				if(indexes[current] == strs[0].length && j != strs[0].length - 1){
					continue loop;
				}
				current = (current + 1) % 2;
			}

			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}

}

