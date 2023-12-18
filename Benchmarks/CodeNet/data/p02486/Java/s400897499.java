import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(true) {
				String str = input.readLine();
				String array[] = str.split(" ");
				int n = Integer.parseInt(array[0]);
				int x = Integer.parseInt(array[1]);
				if(n+x == 0) { break; }
				combo(n, x);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void combo(int a, int b) {
		int z = 0;
		for (int i=1; i<=a-2; i++) {
			for (int j=i+1; j<=a-1; j++) {
				if(j==i) { continue; }
				for (int k=j+1; k<=a; k++) {
					if(k==i || k==j) { continue; }
					else if (i+j+k == b) { z++; }
				}
			}
		}
		System.out.println(z);
	}
		
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}