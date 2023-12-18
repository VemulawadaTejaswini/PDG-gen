import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();

		String given = sc.nextLine();
		
		// 与えられた括弧の列を、ArrayListに格納する
		ArrayList<Character> problem = new ArrayList<Character>();
		for (int i = 0; i < given.length(); i++) {
			problem.add(given.charAt(i));
		}
		
		// 解答用のコレクションを作成
		// 本当はうまく problem をコピーしたかったが、できなかったので（referenceになったので）、再度作成している
		ArrayList<Character> answer = new ArrayList<Character>();
		for (int i = 0; i < given.length(); i++) {
			answer.add(given.charAt(i));
		}
		
		// 与えられた文字列から、正しい括弧列を削除する。
		// 文字列を一文字ずつ走査し、"()" が見つかったら、これを削除し、最初から走査する。
		// 文字列がなくなるか、最後の文字に到達したら終了。
		int index = 0;
		while (true) {
			if (problem.size() == 0) {
				break;
			}
			
			if (index == problem.size()) {
				break;
			}
			
			if (index == 0) {
				index++;
				continue;
			}
				
			if (problem.get(index - 1) == '(' && problem.get(index) == ')') {
				problem.remove(index);
				problem.remove(index - 1);
				// インデックスを最初に戻す
				index = 0;
				continue;
			}
			index++;
		}

		// "(" と ")" の数を数える。
		int left = 0;
		int right = 0;
		for (int i = 0; i < problem.size(); i++) {			
			if(problem.get(i) == '(') {
				left++;
			} else {
				right++;
			}
		}
		// debug
		// System.out.println("left: " + left + " right: " + right);
		// System.out.println(answer.size());
		
		
		// ")" の数だけ配列の先頭に "(" を加え、"(" の数だけ配列の末尾に ")" を加える。
		for (int i = 0; i < right; i++) {
			answer.add(0, '(');
		}
		for (int i = 0; i < left; i++) {
			answer.add(')');
		}
		
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i));
		}
	}	
}
