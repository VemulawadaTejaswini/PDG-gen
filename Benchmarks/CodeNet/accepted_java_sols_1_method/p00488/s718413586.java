import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] pasta = new int[3];
		int[] juice = new int[2];
		int i, k;
		int min;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<pasta.length; i++){
			pasta[i] = sc.nextInt();
		}
		for(i=0; i<2; i++){
			juice[i] = sc.nextInt();
		}
		min = pasta[0] + juice[0] - 50;
		for(i=0; i<3; i++){
			for(k=0; k<2; k++){
				if(min > pasta[i] + juice[k] - 50){
					min = pasta[i] + juice[k] - 50;
				}
			}
		}
		System.out.println(min);

	}

}