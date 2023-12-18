import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		int s[] = new int[13];
		int h[] = new int[13];
		int c[] = new int[13];
		int d[] = new int[13];
		try {
			String str1 = input.readLine();
			int numbers  = Integer.parseInt(str1);
			while(true) {
				String str2 = input.readLine();
				String array[] = str2.split(" ");
				String card  = array[0];
				int number = Integer.parseInt(array[1]);
				if     (card.equals("S")) { s[number-1] = number; }
				else if(card.equals("H")) { h[number-1] = number; }
				else if(card.equals("C")) { c[number-1] = number; }
				else if(card.equals("D")) { d[number-1] = number; }
				n++;
				if(n==numbers) { break; }
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		for (int i=0; i<13; i++) {
			if(s[i] == 0) {System.out.println("S "+ (i+1)); }
		}
		for (int i=0; i<13; i++) {
			if(h[i] == 0) {System.out.println("H "+ (i+1)); }
		}
		for (int i=0; i<13; i++) {
			if(c[i] == 0) {System.out.println("C "+ (i+1)); }
		}
		for (int i=0; i<13; i++) {
			if(d[i] == 0) {System.out.println("D "+ (i+1)); }
		}
		
	
		
	}
		
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}