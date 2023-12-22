import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 7 == 0) System.out.println("Yes");
		else if(N % 4 == 0) System.out.println("Yes");
		else{
			int n = N / 7;
			boolean flag = false;
			for(int i = 0; i <= n; i++){
				if((N - i * 7) % 4 == 0){
					flag = true;
					break;
				}
			}
			if(flag) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}