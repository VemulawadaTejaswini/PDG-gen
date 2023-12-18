import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
			String line = input.readLine();
			String[] point = line.split(" ");
			int m = Integer.parseInt(point[0]);
			int f = Integer.parseInt(point[1]);
			int r = Integer.parseInt(point[2]);
			if(m == -1 && f == -1 && r == -1) break;
			
			if(m == -1 || f == -1) sb.append("F\n");
			else if(m + f >= 80) sb.append("A\n");
			else if(m + f >= 65) sb.append("B\n");
			else if(m + f >= 50) sb.append("C\n");
			else if(m + f >= 30) {
				if(r >= 50) sb.append("C\n");
				else sb.append("D\n");
			}
			else  sb.append("F\n");
		}
		
		System.out.print(sb);
	}
}