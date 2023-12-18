import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		int n = in.nextInt();
		int base = 1000;
		int ans = 0;
		for(int i=1;;i++){
			int cash = base*i;
			if(cash >= n){
				ans = cash - n;
				break;
			}
		}
		out.println(ans);
	}
}	
