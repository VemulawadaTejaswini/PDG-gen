import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] a = new int[N];
		int max = -1000001, indexMax = -1;
		int min = 1000001, indexMin = -1;
		for(int i = 0; i < N; i++){
			a[i] = in.nextInt();
			if(a[i] < min){
				min = a[i];
				indexMin = i;
			}
			if(a[i] > max){
				max = a[i];
				indexMax = i;
			}
		}
		
		int diff = 0;
		int indexDiff = -1;
		if(Math.abs(min) > Math.abs(max)){
			diff = min;
			indexDiff = indexMin;
		}else{
			diff = max;
			indexDiff = indexMax;
		}
		
		System.out.println(2 * N - 1);
		
		/*
		for(int i = 0; i < N; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
		
		for(int i = 0; i < N; i++){
			a[i] += a[indexDiff];
			System.out.println((indexDiff+1) + " " + (i+1));
		}
		
		/*
		for(int i = 0; i < N; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
		
		if(diff >= 0){
			for(int i = 1; i < N; i++){
				//if(a[i] < a[i-1]) a[i] += a[i-1];
				a[i] += a[i-1];
				System.out.println((i-1+1) + " " + (i+1));
			}
		}else{
			for(int i = N - 2; i >= 0; i--){
				//if(a[i] < a[i-1]) a[i] += a[i-1];
				a[i] += a[i+1];
				System.out.println((i+1+1) + " " + (i+1));
			}
		}
		
		/*
		for(int i = 0; i < N; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
		
	}
}
