
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		int count=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int colors[] = new int[n];
		
		String color[] = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			colors[i] = Integer.parseInt(color[i]);
		}
		
		for(int i =0; i<n-1; i++) {
			if(colors[i] == colors[i+1]) {
				count++;
				try{
				if(colors[i+1]+1 != colors[i+2]) {
					colors[i+1] += 1;
				}else {
					colors[i+1] += 2;
				}
				}catch(Exception e) {
					colors[i+1]++;
				}
			}
		}
		System.out.println(count);
		
	}


}
