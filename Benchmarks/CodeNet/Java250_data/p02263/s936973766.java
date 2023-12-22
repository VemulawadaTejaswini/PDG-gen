import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] ary =  br.readLine().split(" ");
		int[] stack = new int[ary.length];
		int stackCount = -1;
		for(int i = 0 ; i < ary.length ; i++){
			if(ary[i].equals("+")){
				stack[stackCount - 1] = stack[stackCount - 1] + stack[stackCount];
				stackCount--;
			}else if(ary[i].equals("-")){
				stack[stackCount - 1] = stack[stackCount - 1] - stack[stackCount];
				stackCount--;
			}else if(ary[i].equals("*")){
				stack[stackCount - 1] = stack[stackCount - 1] * stack[stackCount];
				stackCount--;
			}else{
				stack[++stackCount] = Integer.parseInt(ary[i]);
			}
		}

		System.out.println(stack[stackCount]);
	}

}