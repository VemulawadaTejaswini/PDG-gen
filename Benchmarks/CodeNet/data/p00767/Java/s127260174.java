
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int h,w,cross;
		dowhile: do {
			h = sc.nextInt();
			if (h == 0) {
				break;
			}
			w = sc.nextInt();
			cross = h * h + w * w;

				for (int hi = h + 1; hi < 151; hi++) {
					for (int wi = hi+1; wi < 151; wi++) {
						int crossi = hi * hi + wi * wi;
						if (crossi == cross) {
							System.out.println(hi + " " + wi);
							continue dowhile;
						}
						if (crossi > cross) {
							break;
						}
					}
				} //for(hi)
			
				calc(cross);
		} while (true);
		sc.close();

	}
	
	//crossより1以上大きい対角線を持つ高さ最小の整長方形
	public static void calc(int cross) {
		int h;
		double w;
		double rootc = Math.sqrt(cross);
		for(h=1;h<=rootc;h++) {
			w = Math.sqrt(cross+1 - h*h);
			if(h<w && w%1==0) {
				System.out.println(h+" "+(int)w);
				return;
			}
		}
		calc(cross+1);
	}

}

