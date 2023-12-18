import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str  = input.readLine();
			String array[] = str.split(" ");
			int h  = Integer.parseInt(array[0]);
			int w  = Integer.parseInt(array[1]);
			square(h,w);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void square(int x, int y) {
		for(int i=0; i<y; i++) {
			for(int j=0; j<x; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}