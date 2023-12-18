import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

import javax.print.attribute.standard.MediaSize.Other;
import javax.xml.bind.ParseConversionEvent;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		final int K = sc.nextInt();
		
		int[][] boats = new int[K][];
		for(int i = 0; i < K; i++){
			final int size = sc.nextInt();
			boats[i] = new int[size];
			
			for(int j = 0; j < size; j++){
				boats[i][j] = sc.nextInt() - 1;
			}
		}
		
		final int R = sc.nextInt();
		boolean[][] bad = new boolean[N][N];
		for(int i = 0; i < R; i++){
			final int one = sc.nextInt() - 1;
			final int two = sc.nextInt() - 1;
			bad[one][two] = bad[two][one] = true;
		}
		
		boolean[] feelgood = new boolean[N];
		Arrays.fill(feelgood, true);
		
		for(int i = 0; i < K; i++){
			for(int j = 0; j < boats[i].length; j++){
				for(int k = j + 1; k < boats[i].length; k++){
					if(bad[boats[i][j]][boats[i][k]]){
						feelgood[boats[i][j]] = feelgood[boats[i][k]] = false;
					}
				}
			}
		}
		
		int count = 0;
		for(boolean f : feelgood){
			if(!f){
				count++;
			}
		}
		
		System.out.println(count);
	}

}