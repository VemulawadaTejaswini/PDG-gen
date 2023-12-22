import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num[] = new int [10];
		String sentences = scan.nextLine();
		String[] kaiseki = sentences.split(" ");
		int often = 0;
		int longest = 0;
		int ofteni = 0;
		int longesti = 0;
		for(int i = 0; i < kaiseki.length;i++){
			int nagasa = kaiseki[i].length();
			if(nagasa > longest){
				longest = nagasa;
				longesti = i;
			}
		}
		int count = 0;
		for(int i = 0;i < kaiseki.length;i++){
			count = 0;
			for(int k = 0;k < kaiseki.length;k++){
				if(kaiseki[i].equals(kaiseki[k])){
					count = count + 1;	
				}
				if(count > often){
				often = count;
				ofteni = i;
			}

		}
			
		}
		System.out.println(kaiseki[ofteni]+ " "+ kaiseki[longesti]);
		
 }
}