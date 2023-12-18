import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//1でパスタの最安値、2でジュースの最安値を記録
		int min1 = 2000, min2 =2000;
		for(int i=0; i<5; i++){
			if(i<3){
				min1 = Math.min(min1, sc.nextInt());
			}
			else{
				min2 = Math.min(min2, sc.nextInt());
			}
		}
		System.out.println(min1+min2-50);
	}
}