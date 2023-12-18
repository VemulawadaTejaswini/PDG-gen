
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int countOperate = 0;//最大操作数
		int N = 0;
		int[] number;

		String num = sc.nextLine();//Nの読み込み
		String line = sc.nextLine();//数字の読み込み
		String[] lines = line.split(" ");
		number = new int[lines.length];

		N = Integer.parseInt(num);
		for (int i = 0; i < lines.length; i++) {
			number[i] = Integer.parseInt(lines[i]);
			//System.out.println(number[i]);
		}


		//System.out.println("while");
		boolean flag = true;//ループを抜け出すためのもの
		while(flag) {
			for(int i = 0; i < lines.length; i++) {
				if(number[i] % 2 == 1) {
					flag = false;
					break;
				}else {
					number[i] = number[i] / 2;
				}
			}

			if(flag) {
				countOperate++;
			}
		}


		System.out.println(countOperate);
	}
}
