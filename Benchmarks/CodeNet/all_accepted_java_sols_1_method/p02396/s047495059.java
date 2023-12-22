//package 挑战程序竞赛数据结构;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 1;
		while(sc.hasNext()) {
			int num = sc.nextInt();
			if(num == 0) break;
			System.out.println("Case "+temp+": "+num);
			temp++;
		}
	}
}

