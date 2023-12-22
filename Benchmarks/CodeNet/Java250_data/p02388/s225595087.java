import java.util.Scanner;

public class Main{
	
	int x,y;
	
	public void in(){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
	}
	
	public void cube(){
		y = x*x*x;
		System.out.println(y);
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.in();
		obj.cube();
	}
}