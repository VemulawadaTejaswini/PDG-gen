import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		int  X = scn.nextInt();
		int  Y = scn.nextInt();
		if(X<=100 && X>=0 && Y<=100 && Y>=0) {
			if(X*6>Y && (Y%2==0) && (Y%4==0) ) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}


		}

}