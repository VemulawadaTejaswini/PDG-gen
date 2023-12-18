import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int minpasta;
		int minjuice;
		int menu;
		minpasta = in.nextInt();
		for(int i = 0; i < 2; i++){
			menu = in.nextInt();
			if(menu < minpasta){
				minpasta = menu;
			}
		}
		minjuice = in.nextInt();
		menu = in.nextInt();
		if(menu < minjuice)	minjuice = menu;
		System.out.println((minpasta + minjuice - 50));
	}
}