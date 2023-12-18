package _6_RecursionDivision;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	int n,q,solvePoint;
	int[] A,m;
	boolean[] isSolve;
	
	public void run(){
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = new int[n];
		
		for (int i = 0; i < n; i++) {
			A[i]= sc.nextInt();
		}
		q = sc.nextInt();
		m = new int[q];
		
		for (int i = 0; i < m.length; i++) {
			m[i]= sc.nextInt();
		}
		isSolve = new boolean[n];
		Arrays.fill(isSolve,false);
		
		solvePoint = 0;
		
		for (int i = 0; i < m.length; i++) {
			solve(0, m[i]);
			solvePoint++;
			if(isSolve[i]){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		
	}
	public void solve(int i,int mi){
		
		if(i==n){
			if (mi==0) {
				isSolve[solvePoint]= true;
			}
			return;
		}
		
		solve(i+1,mi);
		solve(i+1,mi-A[i]);
	}
}