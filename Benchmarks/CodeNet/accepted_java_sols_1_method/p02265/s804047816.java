import java.io.*;
import java.util.Arrays;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for (int i = 0; i<n ; i++ ) {
			String[] str = (br.readLine()).split(" ");
			if (str[0].equals("deleteFirst")) {
				stack.pollFirst();
			}else if(str[0].equals("deleteLast")){
				stack.pollLast();
			}else{
				int a = Integer.parseInt(str[1]);
				if (str[0].equals("insert")) {
					stack.addFirst(a);
				}else{
					stack.remove(a);
				}
			}
		}
		boolean judge = true;
		int k = 0;
		while(judge){
			try{
				int b = stack.pollFirst();
				if (k == 0) {
					System.out.print(b);
				}else{
					System.out.print(" " + b );
				}
				k++;
			}catch (NullPointerException e){
				judge = false;
				System.out.println("");
			}
		}
	}
}