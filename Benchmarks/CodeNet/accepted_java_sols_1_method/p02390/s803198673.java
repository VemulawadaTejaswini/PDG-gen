import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int s =scan.nextInt();
		int m=0,h=0;
		if(s >= 60) {
			m = s/60;
			s = s%60;
		}
		if(m >= 60) {
			h = m/60;
			m = m%60;
		}
        
        System.out.println(h + ":" + m + ":" + s);
	}

}
