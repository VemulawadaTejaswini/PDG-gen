import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		String str=sc.nextLine();
		int max = 0;
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='R'){
				count++;
				max = Math.max(count, max);
			}else{
				count = 0;
			}
		}
		out.println(max);
	}
}
