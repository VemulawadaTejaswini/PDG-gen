import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int te=-1;
		for(int i=0;i<10000;i++){
			if((int) (i*0.08)==a&&(int) (i*0.1)==b){
				te=i;
				break;
				}
		}
		System.out.print(te);
	}

}
