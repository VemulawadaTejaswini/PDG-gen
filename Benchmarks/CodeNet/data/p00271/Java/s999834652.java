import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int[] a = new int[8];
	int[] b = new int[8];
	int[] sa = new int[8];
	int nikka ;
	int ww ;
	
	
public void syukei(){
	for (nikka=1;nikka <8;nikka++){

		 a[nikka] = sc.nextInt();

		 b[nikka] = sc.nextInt();
		 sa[nikka] = a[nikka] - b[nikka];
		
	}
	
}
public void hyouji(){
	for(ww=1;ww<8;ww++){
		
	
	System.out.println(sa[ww]);
	}
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main wao = new Main();
		wao.syukei();
		wao.hyouji();

	}

}