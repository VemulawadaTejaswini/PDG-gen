import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> stack = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		String data = null;
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String command = st.nextToken();
			
			if (command.equals("quit")) {
				break;
			}
			
			if (command.equals("push")) {
				stack.add(st.nextToken());
			} else {
				ans.add(stack.get(stack.size() - 1));
				stack.remove(stack.size() - 1);
			}
		}
		
		for (String a : ans) {
			System.out.println(a);
		}
	}

}