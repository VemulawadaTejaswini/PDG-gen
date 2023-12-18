import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != -1){
			double a=1,b = 1, c = 1;
			double rad = 0.0;
			for(int i = 1; i < n; i++){
				a = c;
				c = Math.sqrt(b + a * a);
				rad += Math.atan2(b, a);
			}
			System.out.printf("%1.2f\n%1.2f\n", c * Math.cos(rad), c * Math.sin(rad));

			//読み込み
			n = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}
}