import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
	
		int x,y,ans1,ans2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		ans1 = x*y;
		ans2 = (x+y)*2;
		System.out.println(ans1 + " " + ans2);
	}
}