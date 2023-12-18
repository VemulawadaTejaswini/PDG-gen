import java.io.*;
import java.util.Arrays;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> stack = new ArrayList<String>();
		for (int i = 0; i<n ; i++ ) {
			String[] str = (br.readLine()).split(" ");
			if (str[0].equals("insert")) {
				stack.add(str[1]);
			}else if(str[0].equals("find")){
				if (stack.indexOf(str[1]) > -1) {
					System.out.println("yes");
				}else{
					System.out.println("no");

				}
			}else{
				System.out.println("Error");
			}
		}
	}
}