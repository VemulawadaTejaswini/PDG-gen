import java.util.Scanner;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		int h = ts/3600;
		int m = ts%3600/60;
		int s = ts%3600%60;
		System.out.println(h + ":" + m +":" + s);
	}
}
