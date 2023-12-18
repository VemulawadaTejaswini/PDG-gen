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
			for(int i = 0;i < n;i++){
				String str = scan.next();
				double h = scan.nextDouble() / 100;
				double w = scan.nextDouble();
				double t = 22.0 - w / (h*h);
				t *= (t < 0)?-1:1;
				if(mStr.equals("") || mbi > t){
					mStr = str;
					mbi = t;
				}
			}
			System.out.println(mStr);
		}
	}
}