import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() { 
		while(true){
			String str[]=sc.nextLine().split(" ");
			if(Integer.valueOf(str[0]).intValue() == 0)break;
			int cnt = 0;
			int ans = 0;
			for(int i = 0;i < str.length;i++){
				int num = Integer.valueOf(str[i]).intValue();
				if(num == 1){
					cnt++;ans++;
				}else{
					if(num > 10){
						ans = ans + 10;
					}else{
						ans = ans + num;
					}
				}
			}
			for(int i = 0;i < cnt;i++){
				if(ans + 10 > 21)break;
				else{
					ans = ans + 10;
				}
			}
			if(ans > 21){
				System.out.println(0);
			}else{
				System.out.println(ans);
			}
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}