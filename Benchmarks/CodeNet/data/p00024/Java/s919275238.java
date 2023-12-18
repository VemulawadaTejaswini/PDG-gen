import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		while(true){
			try{
				double v = sc.nextDouble();
				double t = v / 9.8;
				int y = 0;
				if(v > 0){
					y = (int) (4.9 * t * t) + 5;
				}
				int ans = y / 5;
				int cnt = y % 5;
				if(cnt > 0){
					ans++;
					System.out.println(ans);
				}else{
					System.out.println(ans);
				}
			}catch(Exception g){
				System.exit(0);
			}
		}
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}