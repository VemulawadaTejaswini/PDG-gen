import java.util.*;

public class Main{ //クラス名はMain
    public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.next());
			
			/*--------------------------------*/
			//入力
			//int n = 100;
			int ans = 0;

			for(int a =1;a<n;a++){
				for(int b = 1;b<n;b++){
					if(a*b < n){
						ans++;
					}
				}
			}

			System.out.println(ans);
    }
}

