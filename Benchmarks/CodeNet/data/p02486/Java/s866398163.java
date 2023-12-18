import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while(br.ready()){
				buf = br.readLine();
				Scanner scanner = new Scanner(buf);
				int n = Integer.parseInt(scanner.next());
				int x = Integer.parseInt(scanner.next());
				if(n == 0 && x == 0){
					return;
				}
				int count = 0;
				int i, k;
				for(i = 1; i <= n; i++){
					for(k = 1; k <= n; k++){
						if(k == i){
							continue;
						}
						if(x - (k + i) == k || x - (k + i) == i){
							continue;
						}
						count ++;
					}
				}
				System.out.println(count / 6);
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}