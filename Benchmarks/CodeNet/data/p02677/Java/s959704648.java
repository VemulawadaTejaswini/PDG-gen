import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		int time = h*60+m;//分
		double bt = time*6%360;//分針角度
		double at = time/2;//時針角度
		double sa = Math.abs(at-bt);//分針と時針のなす角度
		if(sa>180)sa = 360 - sa;
		System.out.println(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(sa))));
		//余弦定理知ってるとかレベル高www
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		int time = h*60+m;//分
		double bt = time*6%360;//分針角度
		double at = time/2;//時針角度
		double sa = Math.abs(at-bt);//分針と時針のなす角度
		System.out.println(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(sa))));
		//余弦定理知ってるとかレベル高www
	}
}