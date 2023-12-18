import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
        String[] strs = str.split(" ");
		//--- list内表示 ---
		for(int i = strs.length-1; i >= 0; i--){
			if(i != 0){
				System.out.print(strs[i] + " ");
			}else{
				System.out.print(strs[i]);
			}//if
		}//for
		System.out.println();
	}
}