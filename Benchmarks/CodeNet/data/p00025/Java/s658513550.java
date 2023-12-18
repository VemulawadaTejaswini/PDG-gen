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
		int hit = 0;
		int blow = 0;
		
		int[] ans = new int [4];
		int[] guess = new int[4];
		
		for(int i = 0;i<4;i++){
			ans[i] = scan.nextInt();
		}
		for(int i = 0;i<4;i++){
			guess[i] = scan.nextInt();
		}
		for(int i = 0;i < 4;i++){
			if(ans[i] == guess[i]){
				hit = hit + 1;
			}
		}
		for(int i = 0;i < 4;i++){
			for(int k = 0;k < 4;k++){
				if(k != i){
					if(ans[i]==guess[k]){
						blow = blow + 1;
					}
				}
			}
		}
		System.out.println(hit + " "+blow);
		
 }
}