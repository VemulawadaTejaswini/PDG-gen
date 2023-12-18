import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		if(x == s && y == t){
			System.out.println("0");
		} else {
			System.out.println(Math.sqrt((double)((x-s)*(x-s)+(y-t)*(y-t))));
		}
	}
	
	public static void main(String[] args){
		Main ma = new Main();
	}
}