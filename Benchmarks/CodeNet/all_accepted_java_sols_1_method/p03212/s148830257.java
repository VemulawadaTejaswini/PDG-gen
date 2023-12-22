import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		long num = 333;
		int cnt = 0;
		while(num <= N) {
			cnt++;
			boolean flag[] = new boolean[3];
			String str = String.valueOf(num);
			for(int i = 0; i < str.length(); i++) {
				if(str.substring(i, i + 1).equals("3")) flag[0] = true;
				if(str.substring(i, i + 1).equals("5")) flag[1] = true;
				if(str.substring(i, i + 1).equals("7")) flag[2] = true;
			}
			if(flag[0] && flag[1] && flag[2]) ans++;
			
			if(cnt % 3 == 0) {
				String new_num = "";
				boolean up = false;
				for(int i = 0; i < str.length(); i++) {
					if(str.substring(str.length() - i - 1, str.length() - i).equals("7")) {
						new_num = "3" + new_num;
						if(i == str.length() - 1) {
							new_num = "3" + new_num;
						}
						up = true;
					} else {
						new_num = str.substring(0, str.length() - i - 1) +  String.valueOf(Integer.parseInt(str.substring(str.length() - i - 1, str.length() - i)) + 2) + new_num;
						break;
					}
				}
				num = Long.parseLong(new_num);
			} else {
				num += 2;
			}
		}
		System.out.println(ans);
	}
}
