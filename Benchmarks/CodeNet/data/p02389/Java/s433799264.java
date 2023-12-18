import java.util.Scanner;

public class Main {
	static Scanner  sc = new Scanner(System.in);
	static int h;
	static int w;
	
	public static void main(String[] args){
		h=sc.nextInt();
		w=sc.nextInt();
		int area = h*w;
		int leng = h*2+w*2;
		System.out.println(area+" "+leng);
	}
	
}