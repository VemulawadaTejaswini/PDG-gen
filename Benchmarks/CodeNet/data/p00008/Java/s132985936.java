import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int comb[] = new int[40];
		for(int a = 0;a <= 9;a++){
			for(int b = 0;b <= 9;b++){
				for(int c = 0;c <= 9;c++){
					for(int d = 0;d <= 9;d++){
						comb[a+b+c+d]++;
					}
				}
			}
		}
		String s = "";
		while((s = br.readLine()) != null){
			int input = Integer.parseInt(s);
			System.out.println(comb[input]);
		}
	}
}