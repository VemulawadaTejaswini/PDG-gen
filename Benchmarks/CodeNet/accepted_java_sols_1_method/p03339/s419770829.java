import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count;
		int min = 100000000;

		int numWest=0;
		int numEast=0;
		//ArrayList<Double> westChangeRate = new ArrayList<Double>();
		//ArrayList<Double> eastChangeRate = new ArrayList<Double>();

		for(int i=0; i<N; i++){
			if(S.charAt(i)=='W'){
				numWest ++;
			}
		}
		numEast = N - numWest;
		/*
		for(int i=0; i<N; i++){
			if(S.charAt(i)=='W'){
				westChangeRate.add();
			}
		}*/
		int leftChange = 0;
		int rightChange;
		if(S.charAt(0)=='W'){
			rightChange = numEast;
		}else{
			rightChange = numEast - 1;
		}
		count = rightChange;
		min = Math.min(min,count);
		for(int i=1; i<N; i++){
			count = 0;
			if(S.charAt(i-1)=='W'){
				leftChange ++;
			}
			if(S.charAt(i)=='E'){
				rightChange --;
			}
			count = leftChange + rightChange;
			min = Math.min(min,count);
		}
		System.out.println(min);
	}
}
