import java.util.Scanner;
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int t=0;
		int n=0;
		int z;
		for(z=0;z<4;z++);
		t = sc.nextInt();
		n = sc.nextInt();
		switch(t){
		case 1: System.out.println(n*6000);break;
		case 2: System.out.println(n*4000);break;
		case 3: System.out.println(n*3000);break;
		case 4: System.out.println(n*2000);break;
		}
	}

}