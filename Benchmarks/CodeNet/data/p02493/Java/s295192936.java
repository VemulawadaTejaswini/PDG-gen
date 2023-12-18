import java.io.*;
public class Main {
	static InputStreamReader sr = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(sr);

	public static void main(String[] args) throws IOException{
		int num;

		String s1 = br.readLine();
		String s2 = br.readLine();
		String[] st = s2.split(" ");
		num = Integer.parseInt(s1);

		while(num>0){
			System.out.print(st[num-1]);
			if(num==1) {
				System.out.print("\n");
				break;
			}
			System.out.print(" ");
			num--;
		}
	}
}