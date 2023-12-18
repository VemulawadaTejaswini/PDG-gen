import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			double mbi = 0;
			String mStr = "";
			double h;
			double w;
			double t;
			for(int i = 0;i < n;i++){
				String str = scan.next();
				h = scan.nextDouble() / 100;
				w = scan.nextDouble();
				t = (22.0 - w / h / h);
				t = (t < 0)?-t:t;
				if(mStr.equals("") || mbi > t){
					mStr = str;
					mbi = t;
				}
			}
			System.out.println(mStr);
		}
	}
}