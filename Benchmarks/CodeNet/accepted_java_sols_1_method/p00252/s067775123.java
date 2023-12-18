import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		boolean door = false;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(c == 1){
			door = true;
		} else if(a == 1&&b == 1){
			door = true;
		}
		if(door){
			System.out.println("Open");
		} else {
			System.out.println("Close");
		}
	}

}