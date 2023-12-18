import java.io.*;
import java.util.*;
import java.math.*;
class Main{
	
	static int gcd(int a, int b){
		return b==0 ? a:gcd(b,a%b);
	}
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
		int n = Integer.valueOf(sc.readLine());
		String[] st = sc.readLine().split(" ");
		int map[] = new int[n];
		for(int i=0; i<n; i++)
			map[i] = Integer.valueOf(st[i]);
		int c = gcd(Math.max(map[0],map[1]),Math.min(map[0],map[1]));
		if(n==3)
			c = gcd(Math.max(c,map[2]),Math.min(c,map[2]));
		for(int i=1; i<=c; i++)
			if(c%i==0)
				System.out.println(i);
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}