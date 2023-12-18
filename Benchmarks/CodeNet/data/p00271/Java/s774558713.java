import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int s;
	int[] sa = new int[7];
	
	public void kei(){
		for(s=0;s<sa.length;s++){
			a = sc.nextInt();
			b = sc.nextInt();
			sa[s] = a - b;
			
		}
	}
	
	public void hyouji(){
		for(s=0;s<sa.length;s++){
			System.out.println(sa[s]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main go = new Main();
		go.kei();
		go.hyouji();

	}

}