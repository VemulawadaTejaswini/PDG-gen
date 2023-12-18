import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int m=stdIn.nextInt();
			int n=stdIn.nextInt();
			int r=stdIn.nextInt();
			int sum=m+n;
			String ans;
			if(m==-1&&n==-1&&r==-1)
				break;
			if(m==-1||n==-1)
				ans="F";
			else if(sum>=80)
				ans="A";
			else if(sum>=65)
				ans="B";
			else if(sum>=50)
				ans="C";
			else if(sum>=30){
				if(r>=50)
					ans="C";
				else
					ans="D";
			}
			else
				ans="F";
			System.out.println(ans);
		}
	}
}