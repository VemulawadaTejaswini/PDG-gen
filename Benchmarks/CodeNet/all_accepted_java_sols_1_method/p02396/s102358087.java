import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int value;
		for(int i = 1;(value = Integer.parseInt(in.readLine())) != 0;i++){
			System.out.printf("Case %d: %d%n",i,value);
		}
	}
}