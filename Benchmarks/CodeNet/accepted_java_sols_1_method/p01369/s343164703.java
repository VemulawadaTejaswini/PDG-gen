import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[] left = {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
		while(true){
			int cnt = 0;
			boolean left_hand = false;
			char[] input = stdIn.next().toCharArray();
			if(input[0]=='#'){
				return;
			}
			for(int j=0;j<left.length;j++){
				if(input[0]==left[j]){
					left_hand = true;
					break;
				}
			}
			for(int i=1;i<input.length;i++){
				boolean left_flag = false;
				for(int j=0;j<left.length;j++){
					if(input[i]==left[j]){
						left_flag = true;
						break;
					}
				}
				if(left_hand!=left_flag){
					cnt++;
					left_hand = left_flag;
				}
			}
			System.out.println(cnt);
		}
	}
}