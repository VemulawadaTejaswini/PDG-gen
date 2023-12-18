package a2;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] sa = new int[7];
		for(int i=0;i<4;i++){
		int a = sc.nextInt();
		int b = sc.nextInt();

		switch (a){
		case 1:
			sa[0]+=6000*b;
		case 2:
			sa[1]+=4000*b;
		case 3:
			sa[2]+=3000*b;
		case 4:
			sa[3]+=2000*b;
		}
		;
		}
		for(int i = 0;i<4;i++){
			System.out.println(sa[i]);
		}
	}

}