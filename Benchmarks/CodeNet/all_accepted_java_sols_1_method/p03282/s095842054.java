import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		long B = Long.parseLong(br.readLine());
		String ans = "1";
		long count = 0;
		for(int i =0; i<A.length(); i++) {
			String sub = A.substring(i,i+1);
			if(A.substring(i,i+1).equals("1")) {
				count++;
			}
		
		
			else if(!sub.equals("1")) {
				ans = sub;
				break;
			}
		}
		if(count>=B) {
			System.out.println("1");
		}
		else {
			System.out.println(ans);
		}
	}

}
