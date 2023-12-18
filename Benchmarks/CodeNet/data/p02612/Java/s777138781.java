import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int i = 0;
        int ans = 0;
        while(true) {
            int money = i * 1000;
            if(money >= n){
                ans = money - n;
                break;
            }
            i++;
        }
		System.out.println(ans);
	}
}