package pacage_01;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
	
	int jd = b/d;
	int sd = c/e;
	int x;
	if(jd<sd){
	x = sd;	
	}
	else{
		x = jd;
	}
	int ans = a-x;
	if(a<x){
		ans = 1;
	}
	System.out.println(ans);
}
}