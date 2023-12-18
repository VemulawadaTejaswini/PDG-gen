import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans ="";
		int i =1;
		while(true){
			String y = br.readLine();
			int x = Integer.parseInt(y);
			if (x==0) {
				break;
			}
ans += "Case " + i + ": " + x + "\n";
i++;
		}
		System.out.printf(ans);
	}
}