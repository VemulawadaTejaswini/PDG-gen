import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				String str  = input.readLine();
				String array[] = str.split(" ");
				int h  = Integer.parseInt(array[0]);
				int w  = Integer.parseInt(array[1]);
				if(h==0 && w==0) { break; }
				square(h,w);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void square(int x, int y) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}