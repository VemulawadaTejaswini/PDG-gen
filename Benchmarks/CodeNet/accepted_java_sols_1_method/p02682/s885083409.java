import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();	//1の枚数
		int b = sc.nextInt();	//0の枚数
		int c = sc.nextInt();	//-1の枚数
		int k = sc.nextInt();	//選択の枚数

		int sum = 0;
		//1を取り出せるか？
		if(k>0) {
			for(int i=0; i < a; i++) {
				sum++;
				k--;
				if(k == 0) {
					break;
				}
			}
		}

		//0を取り出せるか?
		if(k>0) {
			for(int i=0; i < b; i++) {
				k--;
				if(k == 0) {
					break;
				}
			}
		}

		//-1を取り出せるか？
		if(k>0) {
			for(int i=0; i < c; i++) {
				sum--;
				k--;
				if(k == 0 || k > c) {
					break;
				}
			}
		}

		System.out.println(sum);
	}
}