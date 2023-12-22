import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//たて a cm よこ b cm の長方形の面積と周の長さを求めるプログラムを作成して下さい。
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" "); //array[0]=たて,array[1]=よこ
		//面積
		System.out.print(Integer.parseInt(array[0])*Integer.parseInt(array[1]) +" ");
		//周の長さ=array[0]*2+array[1]*2
		System.out.println(Integer.parseInt(array[0])*2+Integer.parseInt(array[1])*2);
	}
}