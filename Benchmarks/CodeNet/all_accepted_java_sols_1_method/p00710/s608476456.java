import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		try {
			for(;;){
				buf = br.readLine();
				Scanner scanner = new Scanner(buf);
				int n = scanner.nextInt();
				int r = scanner.nextInt();
				if(n == 0 && r == 0){
					return;
				}
				ArrayList<Integer> cards = new ArrayList<Integer>();
				int i, p = 0, c;
				for(i = n; i > 0; i--){
					cards.add(i);
				}
				for(i = 0; i < r; i++){
					buf = br.readLine();
					scanner = new Scanner(buf);
					p = scanner.nextInt();
					c = scanner.nextInt();

					ArrayList<Integer> bList = new ArrayList<Integer>(cards.subList(0, p - 1));
					ArrayList<Integer> oList = new ArrayList<Integer>(cards.subList(p - 1, p - 1 + c));
					ArrayList<Integer> rList = new ArrayList<Integer>(cards.subList(p - 1 + c, n));
					cards = new ArrayList<Integer>();
					cards.addAll(oList);
					cards.addAll(bList);
					cards.addAll(rList);
					//System.out.println(cards.toString());
				}
				System.out.println(cards.get(0));
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}