import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	private static final int BIG_NUM  = 2000000000;
	private static final int MOD  = 1000000007;
	private static char[] line;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		line = new char[101];
		String input_str;
		int length;

		try {
			int num_eq = Integer.parseInt(br.readLine());

			for(int loop = 0; loop < num_eq; loop++){

				input_str = br.readLine();

				length = 0;
				for(int i = 0; input_str.charAt(i) != '='; i++){
					line[i] = input_str.charAt(i);
					length++;
				}

				System.out.println(calc_E(line,0,length-1));
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static int calc_E(char line[],int left,int right){
		int depth = 0;
		Queue<Integer> Q = new ArrayDeque<Integer>();

		//深さ0の、プラスまたは-を探す
		for(int i = left; i <= right; ){
			if(line[i] == '(')depth++;
			else if(line[i] == ')')depth--;

			if(depth != 0){
				i++;
			}else if(line[i] != '+' && line[i] != '-'){
				i++;
			}else{
				if(line[i] == '+'){
					Q.add(i);
					i++;
				}else{ //line[i] == '-'
					if((i != left) && ((line[i-1] >= '0' && line[i-1] <= '9') || line[i-1] == ')')){ //-は、depthが0でもnegの場合あり
						Q.add(i);
					}
					while(i <=right && line[i] == '-')i++; //negの-が続いている場合があるので、読み飛ばす
				}
			}
		}

		if(Q.isEmpty()){ //深さ0の+-がない
			return calc_T(line,left,right);
		}

		int tmp = calc_E(line,left,Q.peek()-1),tmp_right;

		if(tmp == BIG_NUM)return BIG_NUM;

		while(!Q.isEmpty()){
			int loc = Q.peek();
			Q.poll();

			if(Q.isEmpty()){
				tmp_right = calc_T(line,loc+1,right);
			}else{
				tmp_right = calc_T(line,loc+1,Q.peek()-1);
			}

			if(tmp_right == BIG_NUM){
				return BIG_NUM;
			}

			if(line[loc] == '+'){
				tmp += tmp_right;
			}else{
				tmp -= tmp_right;
			}
		}
		return tmp;
	}

	public static int calc_T(char line[],int left,int right){
		int depth = 0;
		Queue<Integer> Q = new ArrayDeque<Integer>();

		//深さ0の、*,/を探す
		for(int i = left; i <= right; ){
			if(line[i] == '(')depth++;
			else if(line[i] == ')')depth--;

			if(depth != 0){
				i++;
			}else if(line[i] != '*' && line[i] != '/'){
				i++;
			}else{
				Q.add(i);
				i++;
			}
		}

		if(Q.isEmpty()){ //深さ0の*,/がない
			return calc_F(line,left,right);
		}

		int tmp = calc_T(line,left,Q.peek()-1),tmp_right;

		if(tmp == BIG_NUM)return BIG_NUM;

		while(!Q.isEmpty()){
			int loc = Q.peek();
			Q.poll();

			if(Q.isEmpty()){
				tmp_right = calc_F(line,loc+1,right);
			}else{
				tmp_right = calc_F(line,loc+1,Q.peek()-1);
			}

			if(tmp_right == BIG_NUM){
				return BIG_NUM;
			}

			if(line[loc] == '*'){
				tmp *= tmp_right;
			}else{
				tmp /= tmp_right;
			}
		}
		return tmp;
	}
	public static int calc_F(char line[],int left,int right){

		if(line[left] >= '0' && line[left] <= '9'){
			return calc_NUM(line,left,right);

		}else if(line[left] == '-'){
			return -1*calc_F(line,left+1,right);
		}else if(line[left] == '('){

			int depth = 0;
			int close_pos = BIG_NUM;

			for(int i = left; i <= right; i++){
				if(line[i] == '(')depth++;
				else if(line[i] == ')'){
					depth--;
					if(depth == 0){
						close_pos = i;
						break;
					}
				}
			}
			if(close_pos == BIG_NUM || close_pos != right)return BIG_NUM;

			return calc_E(line,left+1,close_pos-1);
		}else{
			return BIG_NUM;
		}
	}
	public static int calc_NUM(char line[],int left,int right){

		int ret = 0;
		for(int i = left; i <= right; i++){
			ret = 10*ret+line[i]-'0';
		}
		return ret;
	}
}


