import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int w = kbd.nextInt();
		int h = kbd.nextInt();
		int x = kbd.nextInt();
		int y = kbd.nextInt();
		int r = kbd.nextInt();
		if ((x-r)<0 || (y-r) <0 || (x+r) >w || (y+r) >h)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}