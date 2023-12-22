import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		String[] ss = s.split(" ");
		
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		if(a < b){
			System.out.println("a < b");
		}
		else if(a > b){
			System.out.println("a > b");
		}
		else{System.out.println("a == b");}
		
	}

}