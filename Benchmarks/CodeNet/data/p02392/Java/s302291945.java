import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//a＜b＜cの条件を満たすとき、Yesを返し、それ以外ならNoを返す
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}

