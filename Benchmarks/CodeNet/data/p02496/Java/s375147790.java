import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cards = Integer.parseInt(input.readLine());
		int [] h = new int [13];
		int [] d = new int [13];
		int [] c = new int [13];
		int [] s = new int [13];
		
		for(int i = 0 ; i < cards ; i++){
			String line = input.readLine();
			String[] card = line.split(" ");
			String mark = card[0];
			int num = Integer.parseInt(card[1]);
			
			if(mark.equals("H")) h[num - 1] = 1;
			if(mark.equals("D")) d[num - 1] = 1;
			if(mark.equals("C")) c[num - 1] = 1;
			if(mark.equals("S")) s[num - 1] = 1;
		}
		
		for(int j = 0 ; j < 13 ; j++){
			if(s[j] == 0) sb.append("S " + (j+1) + "\n");
		}
		for(int j = 0 ; j < 13 ; j++){
			if(h[j] == 0) sb.append("H " + (j+1) + "\n");
		}
		for(int j = 0 ; j < 13 ; j++){
			if(c[j] == 0) sb.append("C " + (j+1) + "\n");
		}
		for(int j = 0 ; j < 13 ; j++){
			if(d[j] == 0) sb.append("D " + (j+1) + "\n");
		}
		System.out.print(sb);
		
		}
}