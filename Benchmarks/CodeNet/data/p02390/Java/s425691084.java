import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int s = kbd.nextInt();
		int h =s/3600;int m = (s/60)%60;s=s%60;
		System.out.println(h+":"+m+":"+":"+s);

	}

}