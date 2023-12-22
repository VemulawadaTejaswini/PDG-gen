import java.util.Scanner;

public class Main {


	/**
	 * たてとよこの長方形面積と周の長さを求める
	 * @param args　たて、よこ
	 */
		public static void main(String[] args){
			int tate ,yoko;
			Scanner scan = new Scanner(System.in);
			tate =	scan.nextInt();
			yoko = scan.nextInt();
			System.out.println(tate*yoko +" "+(tate+yoko)*2);
		}
}

