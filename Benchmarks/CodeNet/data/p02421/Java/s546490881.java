import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int taro =0;
		int hanako = 0;
		int n = sc.nextInt(); //ｎ枚のカードを入力

		for(int i=0; i<n;i++) { //nの数だけ処理を繰り返す
			String taros = sc.next(); //太郎のカードを入力
			String hanakos = sc.next(); //花子
		if(taros.compareTo(hanakos)>0) { //太郎のカードが大きい場合3点
			taro=taro+3;
		}else if(taros.compareTo(hanakos)<0) { //太郎のカードが小さい場合花子に3点
			hanako=hanako+3;
		}else if(taros.compareTo(hanakos)==0) { //同じ場合は二人に1点
			taro++; hanako++;
		}
		}
		System.out.println(taro + " " + hanako);
	}

}
