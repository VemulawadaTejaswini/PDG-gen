import java.util.Scanner;
public class Main{
	int a;
	public void input(){
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
	}
	public void output(){
		System.out.println(a*a*a);
	}
	public static void main(String[] args){
		Main p = new Main();
		p.input();
		p.output();
	}
}