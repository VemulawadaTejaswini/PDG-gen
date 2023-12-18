import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			if(n == 0){
				break;
			}
			int A = 0;
			int B = 0;
			for(int i = 0; i < n; i++){
				String lines = reader.readLine();
				String[] str = lines.split(" ", -1);
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				if(a > b){
					A += a + b;
				}
				if(a < b){
					B += a + b;
				}
				if(a == b){
					A += a;
					B += b;
				}
			}
			System.out.println(A + " " + B);
		}
	}
}