import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] inputs = line.toCharArray();
		int ans = inputs.length;

		int cnt = 0;
		for(int i = 0; i < inputs.length; i++) {
			if(i%2 == 0 && inputs[i] == '1')cnt++;
			if(i%2 == 1 && inputs[i] == '0')cnt++;
		}
		ans = ans < cnt ? ans : cnt;
		
		cnt = 0;
		for(int i = 0; i < inputs.length; i++) {
			if(i%2 == 0 && inputs[i] == '0')cnt++;
			if(i%2 == 1 && inputs[i] == '1')cnt++;
		}
		ans = ans < cnt ? ans : cnt;

		System.out.println(ans);
	}
}


