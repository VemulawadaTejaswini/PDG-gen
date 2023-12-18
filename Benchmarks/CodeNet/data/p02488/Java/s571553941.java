import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int judge = 0;
			int num = sc.nextInt();
			String ans = reader.readLine();
			for(int i = 0; i < num-1; i++){
				String line = reader.readLine();
				judge = line.compareTo(ans);
				if(judge < 0){
					ans = line;
				}
			}
			System.out.println(ans);
		} catch (IOException e){
			System.out.println(e);
		}
	}
}