import java.io.*;
import java.util.*;

class Main {

	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str1  = input.readLine();
			String str2  = input.readLine();
			String array[] = str2.split(" ");
			int x  = Integer.parseInt(str1);
		
			for(int i=1; i<=x; i++) {
				System.out.print(array[x-i]);
				if(i==x) {
					System.out.print("\n");
				}
				else {
					System.out.print(" ");
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}