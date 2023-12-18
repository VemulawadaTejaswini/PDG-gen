import java.util.Scanner;

public class Main{
	static final int[] p = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2};
	static final int[] q = {0, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, 0, 1, 1, 1, 2, 2, 2};
	static final int[] r = {0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			String str = sc.next();
			if(str.equals(".")) break;

			int cnt = 0;
			for(int i=0; i<27; i++){
				String tmp = str;
				tmp = tmp.replace('P', (char)('0'+p[i]));
				tmp = tmp.replace('Q', (char)('0'+q[i]));
				tmp = tmp.replace('R', (char)('0'+r[i]));
				int tf;
				if(tmp.charAt(0)=='('){
					tf = formula(tmp.substring(1, tmp.length()-1));
				}else{
					tf = formula(tmp);
				}
				if(tf==2) cnt++;
			}

			System.out.println(cnt);
		}
	}

	static public int formula(String str){
		if(str.length()==1) return str.charAt(0) - '0';
		int left, right;
		int i = 0, flag = 0;

		int j = 0;
		while(str.charAt(j)=='-') j++;

		while(true){
			if(str.charAt(i)=='('){
				flag++;
			}else if(str.charAt(i)==')'){
				flag--;
			}else if(flag==0 && (str.charAt(i)=='+' || str.charAt(i)=='*')){
				break;
			}
			if(++i==str.length()) break;
		}

		if(i==str.length()){
			if(j%2==0){
				if(str.charAt(j)=='('){
					return formula(str.substring(j+1, i-1));
				}else{
					return formula(str.substring(j, i));
				}
			}else{
				if(str.charAt(j)=='('){
					return 2 - formula(str.substring(j+1, i-1));
				}else{
					return 2 - formula(str.substring(j, i));
				}
			}
		}else{
			if(str.charAt(i-1)==')'){
				left = formula(str.substring(j+1, i-1));
			}else{
				left = formula(str.substring(j, i));
			}
			if(j%2==1) left = 2- left;

			if(str.charAt(i+1)=='('){
				right = formula(str.substring(i+2, str.length()-1));
			}else{
				right = formula(str.substring(i+1, str.length()));
			}

			if(str.charAt(i)=='+'){
				if(left==2||right==2){
					return 2;
				}else if(left==1||right==1){
					return 1;
				}else{
					return 0;
				}
			}else{
				if(left==0||right==0){
					return 0;
				}else if(left==1||right==1){
					return 1;
				}else{
					return 2;
				}
			}
		}
	}
}