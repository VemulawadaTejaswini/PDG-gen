import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> w=new ArrayList<Integer>();
		ArrayList<Integer> k=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			w.add(scanner.nextInt());
		}
		for(int i=0;i<10;i++){
			k.add(scanner.nextInt());
		}
		Collections.sort(w);
		Collections.sort(k);
		int ws=0,ks=0;
		for(int i=0;i<3;i++){
			ws+=w.get(9-i);
			ks+=k.get(9-i);
		}
		System.out.println(ws+" "+ks);
	}
}