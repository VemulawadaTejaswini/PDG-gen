import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		boolean[][] card = new boolean[4][13];
		int n = Integer.parseInt(in.readLine());
		for(int i = 0;i < n; ++i){
			ia = in.readLine().split(" ");
			switch(ia[0].charAt(0)){
			case 'S':
				card[0][Integer.parseInt(ia[1])-1] = true;
				break;
			case 'H':
				card[1][Integer.parseInt(ia[1])-1] = true;
				break;
			case 'C':
				card[2][Integer.parseInt(ia[1])-1] = true;
				break;
			case 'D':
				card[3][Integer.parseInt(ia[1])-1] = true;
				break;
			}
		}
		for(int j = 0;j < 4; ++j){
			for(int i = 0;i < 13; ++i){
				if(!card[j][i]){
					switch(j){
					case 0:
						System.out.println("S " + (i+1));
						break;
					case 1:
						System.out.println("H " + (i+1));
						break;
					case 2:
						System.out.println("C " + (i+1));
						break;
					case 3:
						System.out.println("D " + (i+1));
						break;
					}
				}
			}
		}
	}
}