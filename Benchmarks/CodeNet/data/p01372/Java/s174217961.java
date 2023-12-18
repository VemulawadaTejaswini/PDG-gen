
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	/**
	 * @param args
	 */
	public static char[] op = new char[10];
	public static String[] val2 = new String[11];
	public static int[] val = new int[11];
	public static int[] nest = new int[10];
	public static int numOfOp = 0;
	public static int maxNest = 0;
	public static TreeSet<Integer> tree = null;
	public static int[] order = new int[10];
	public static boolean[] used = new boolean[10];
	public static String last = null;
	public static int len = 0;
	public static int point = 0;
	public static boolean nan = false;
	public static void main(String[] args) {
		doIt();

	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		while(input.equals("#") == false){
			analyze(input);
			//printVal();
			Arrays.fill(used, false);
			tree = new TreeSet<Integer>();
			setOrder(0,maxNest);
			System.out.println(tree.size());
			//printVal();
			input = sc.next();
		}
	}
	
	public static int getNext(){
		int ret = 0, left = 0, right = 0;
		char c = last.charAt(point);
		while(c == ' '){
			point--;
			c = last.charAt(point);
		}
		
		if(c == '+'){
			point--;
			right = getNext();
			//point--;
			left = getNext();
			//point--;
			ret = left + right;
		}
		else if(c == '-'){
			point--;
			right = getNext();
			//point--;
			left = getNext();
			//point--;
			ret = left - right;
		}
		else if(c == '*'){
			point--;
			right = getNext();
			//point--;
			left = getNext();
			//point--;
			ret = left * right;
		}
		else if(c == '/'){
			point--;
			right = getNext();
			//point--;
			left = getNext();
			//point--;
			if(right == 0){
				nan = true;
				return -1;
			}
			else{
				ret = left / right;
			}
		}
//		else if(c == '('){
//			point++;
//			ret = getNext();
//			//)の分跳ばす
//			point++;
//		}
		else{
			//数字のはず
			if(c == 'a'){
				ret = val[10];
			}
			else{
				ret = val[Character.getNumericValue(c)];
			}
			point--;
		}
		return ret;
	}
	
	//文字列lastを数字に変換
	public static void calc(){
		nan = false;
		len = last.length();
		point = len - 1;
		//System.out.println("last = " + last);
		//printVal();
		int res = getNext();
		//System.out.println("res = " + res);
		if(nan == false && tree.contains(res) == false){
			tree.add(res);
		}
	}
	
	public static void printVal(){
		for(String a : val2){
			System.out.print(a + ", ");
		}
		System.out.println();
	}

	//ネストnの大きな順に後置記法のストリングを作って結合していく
	public static void setOrder(int depth, int nLevel){
		if(depth == numOfOp){
			calc();
		}
		boolean bOK = false;
		for(int i = 0; i < numOfOp; i++){
			if(nest[i] == nLevel){
				if(used[i] == false){
					used[i] = true;
					//System.out.println("val[i] = " + val[i] + ", val[i+1] = " + val[i+1]);
					last = val2[i] + ' ' + val2[i+1] + ' ' + op[i];
					//System.out.println("ONE : depth = " + depth + ", nLevel = " + nLevel);
					//printVal();
					//左を見る
					int left = -1;
					String lValue = null;
					for(int j = i - 1; j >= 0; j--){
						if(used[j] == false){
							left = j;
							lValue = val2[j + 1];
							val2[j + 1] = last;
							break;
						}
					}
					//右を見る
					int right = -1;
					String rValue = null;
					for(int j = i + 1; j < numOfOp; j++){
						if(used[j] == false){
							right = j;
							rValue = val2[j];
							val2[j] = last;
							break;
						}
					}
					setOrder(depth + 1, nLevel);
					
					//修復作業
					if(left != -1){
						val2[left + 1] = lValue;
					}
					if(right != -1){
						val2[right] = rValue;
					}
					//System.out.println("TWO : depth = " + depth + ", nLevel = " + nLevel);
					//printVal();
					used[i] = false;
					bOK = true;
				}
			}
		}
		if(bOK == false){
			if(nLevel != 0){
				setOrder(depth, nLevel - 1);
			}
		}

	}


	public static void analyze(String input){
		numOfOp = 0;
		maxNest = 0;
		int nestLevel = 0;
		int v = 0;
		int len = input.length(); 
		for(int i = 0; i < len; i++){
			char c = input.charAt(i);
			switch(c){
			case '(':
				nestLevel++;
				maxNest = Math.max(nestLevel, maxNest);
				break;
			case ')':
				nestLevel--;
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				op[numOfOp] = c;
				nest[numOfOp] = nestLevel;
				numOfOp++;
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				String ss = "";
				while('0' <= c && c <= '9'){
					ss += String.valueOf(c);
					i++;
					if(len <= i){
						break;
					}
					c = input.charAt(i);
				}
				i--;
				val[v] = Integer.parseInt(ss);
				if(v == 10){
					val2[v] = "a";
				}
				else{
					val2[v] = String.valueOf(v);
				}
				v++;
				break;
			}
		}
	}
}