import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();


//	500円玉が取れなくなるまで
		int count500 = 0;
		while(total >= 500) {
			total -= 500;
			count500++;
		}

//	5円玉が取れなくなるまで
		int count5 = 0;
		while(total >= 5){
			total -= 5;
			count5++;
		}

//	嬉しさの合計を表示
		System.out.print(count500*1000 + count5*5);
	}
}
