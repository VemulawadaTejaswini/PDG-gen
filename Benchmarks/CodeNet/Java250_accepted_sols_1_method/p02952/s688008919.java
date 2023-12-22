import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int len = input.length();
		int num = Integer.parseInt(input);
		int ans = 0;
		switch(len%2){
			case 0:
			for(int i = 0; i < len; i+=2)ans += 9 * Math.pow(10, i);
			break;

			case 1:
			if(len == 1){
				ans = num;
				break;
			}
			for(int i = 0; i < len-1; i+=2)ans += 9 * Math.pow(10, i);
			ans += Integer.parseInt(input.substring(1))+1;
			ans += (Integer.parseInt(input.substring(0, 1)) - 1) * Math.pow(10, len-1);
			break;
		}

		System.out.println(ans);
	}
}


