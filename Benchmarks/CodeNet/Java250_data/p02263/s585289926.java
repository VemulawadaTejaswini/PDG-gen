import java.util.Scanner;

public class Main {
	//フィールド
	int top = 0; //スタックポインタ
	int[] S = new int[101]; //スタック

	//初期化
	void initialize() {
		top = 0;
	}

	//要素が存在しないかを判定
	boolean isEmpty() {
		return top == 0;
	}

	//要素が満タンかどうか判定
	boolean isFull() {
		return top >= S.length;
	}

	//要素の追加
	void push(int x) {
		if (!isFull()) { //配列に空きがある
			top++;
			S[top] = x;
		} else { //配列に空きがない
			System.err.println("エラー（オーバーフロー）");
		}
	}

	//要素の取り出し
	int pop() {
		if (isEmpty()) { //配列に要素がある
			System.err.println("エラー（アンダーフロー）");
		}
		top--;
		return S[top + 1];
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextLine()) {
			String s = sc.nextLine();
			String[] ary = s.split("\\s");
			//操作
			for (int i = 0; i < ary.length; i++) {
				String str = ary[i];
				int a;
				int b;
				switch (str) {
				//演算子だった場合
				case "+":
					a = main.pop();
					b = main.pop();
					main.push(a + b);
					break;
				case "-":
					a = main.pop();
					b = main.pop();
					main.push(b - a);
					break;
				case "*":
					a = main.pop();
					b = main.pop();
					main.push(a * b);
					break;
				//数字だった場合
				default:
					main.push(Integer.parseInt(str));
					break;
				}
			}
		}
		System.out.println(main.S[main.top]);
	}

}

