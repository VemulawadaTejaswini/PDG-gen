import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt()*10;
int b=scan.nextInt()*10;
if((a+b)/2%10==0) {
	System.out.println((a+b)/2/10);
}
else {
	System.out.println((a+b)/2/10+1);
}
	}
}
