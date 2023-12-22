import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long ans = 0;
		for(int i = 0;i < n;i++){
			int val = s.nextInt();
			int ele = val;
			int count = 0;
			while(true){
				if(ele%2!=0)
					break;
				ele = ele/2;
				count++;
			}
			ans += count;
		}
			System.out.println(ans);
	}
}
