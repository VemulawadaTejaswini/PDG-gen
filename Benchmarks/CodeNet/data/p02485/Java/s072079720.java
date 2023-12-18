import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(true) {
				String str = input.readLine();
				int count = 0;
				if(str.equals("0")) { break; }	
				for(int i=0; i<str.length(); i++) {
					count += Integer.parseInt(str.substring(i,i+1));
				}
				System.out.println(count);
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