import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int[] sa = new int[7];
	int s;

	public void keisan(){
		for(s=0;s<=6;s++){
			a = sc.nextInt();
			b = sc.nextInt();
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