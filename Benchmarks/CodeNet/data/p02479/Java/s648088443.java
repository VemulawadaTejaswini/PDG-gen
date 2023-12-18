import java.io.*;
import java.util.*;
class Main{
	public static void print(Object o){
		System.out.println(o);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i1 = in.nextInt();
		double ans1 = i1*i1*3.141592653589;
		double ans2 = i1*2*3.141592653589;
		print(ans1 + " " + ans2);
	}
}