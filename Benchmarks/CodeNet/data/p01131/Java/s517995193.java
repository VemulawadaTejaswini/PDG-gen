import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static char[] input;
	static char[][] keys = {
		{},
        {'.',',','!','?',' '},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
	};
	public static void main(String[] args) {
		while(read()){
			
		}
	}

	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			input = sc.next().toCharArray();
			solve();
		}
		return true;
	}
	
	static void solve(){
		StringBuilder sb = new StringBuilder();
		int index = 0;
		while(index <input.length){
			if(input[index] == '0'){
				index++;
			}else{
				char c = input[index++];
				int k = 0;
				while(input[index] == c){
					index++;
					k++;
				}
				sb.append(keys[c-'0'][k%keys[c-'0'].length]);
				index++;
			}
		}
		System.out.println(sb);
	}
}