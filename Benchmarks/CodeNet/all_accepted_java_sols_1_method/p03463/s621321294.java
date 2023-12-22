import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	if((c-b)%2==0) {
		System.out.println("Alice");
	}
	else {
		System.out.println("Borys");
	}
	}
}