import java.util.Scanner;

public class Main {


     public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			int ans_cnt = 0;
			int n = scan.nextInt();//???????????°???????????????
			int x = scan.nextInt();//???????±?????????°???????????????
			if(n == 0 && x == 0)
				break;
			for(int cnt1 = 1; cnt1 <= n; cnt1++){
				for(int cnt2 = cnt1 + 1; cnt2 <= n; cnt2++){
					for(int cnt3 = cnt2 +1; cnt3 <= n; cnt3++){
						if((cnt1 + cnt2 + cnt3) == x)
							ans_cnt++;
					}
				}
			}
			System.out.println(ans_cnt);	
		}
		scan.close();
	}
}