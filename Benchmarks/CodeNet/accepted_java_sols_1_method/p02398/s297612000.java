import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int c = Integer.parseInt(strs[2]);
		int cnt = 0;
		for(int i = a; i <= b; i++){
			if((c % i) == 0){
				cnt++;
			}//if
		}//for
		System.out.println(cnt);
		br.close();
	}
}