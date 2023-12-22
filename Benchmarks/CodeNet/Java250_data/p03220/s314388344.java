import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //宮殿の候補地点
		int t = stdIn.nextInt(); //気温の定数
		int a = stdIn.nextInt(); //この温度に近い場所を探す
		int [] place = new int[n]; //宮殿の標高
		for(int i = 0; i < n; i++) {
			place[i] = stdIn.nextInt();
		}
		
		double ans = Double.MAX_VALUE; //宮殿の地点１が答えにしておく
		int j = 0;
		for(int i = 0; i < n; i++) {
			double ave = t-(place[i] * 0.006);
			double an = (ave-a)>0?ave-a:a-ave;
			if(ans>an) {
				j = i+1;
				ans = an;
			}
		}
		
		System.out.println(j);
		
		
	}

}
