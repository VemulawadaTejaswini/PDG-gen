import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a=Integer.parseInt(scan.next());
		int b=Integer.parseInt(scan.next());
		int c=Integer.parseInt(scan.next());
		int temp=0;
		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}if(a>c){
			temp = a;
			a = c;
			c = temp;
		}if(b>c){
			temp = b;
			b = c;
			c = temp;
		}
			System.out.println(a+" "+b+" "+c);
	}	
}