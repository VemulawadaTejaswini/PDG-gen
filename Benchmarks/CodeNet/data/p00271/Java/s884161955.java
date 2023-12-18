import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int[] sa = new int[7];
	int s;

	public void keisan(){
		System.out.println("一週間の気温を入力してください");
		for(s=0;s<=6;s++){
			a = sc.nextInt();
			if(-40>a&&a>40){
				continue;
			}
			b = sc.nextInt();
			if(-40>b&&b>40){
				continue;
			}
			
			sa[s] = a-b;
		}

	}

	public void hyouji(){
		for(s=0;s<=6;s++){
			System.out.println(sa[s]);
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main go = new Main();
		go.keisan();
		go.hyouji();
	}
}	