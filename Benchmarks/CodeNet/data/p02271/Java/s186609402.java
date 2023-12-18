import java.util.*;
import java.io.*;
class Main{

	static int a[]=new int[20];
	static int n;
	public static void main(String[]args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		n=Integer.parseInt(in.readLine());
		String str[]=in.readLine().split(" ");
		for(int i=0;i<str.length;i++)
			a[i]=Integer.parseInt(str[i]);
		int q=Integer.parseInt(in.readLine());
		String str1[]=in.readLine().split(" ");
		int b[]=new int[q];
		for(int i=0;i<q;i++){
			b[i]=Integer.parseInt(str1[i]);
			if(solve(0, 0, b[i]))
				out.println("yes");
			else
				out.println("no");
		}
	}
	public static boolean solve(int p, int t, int target){
		if(t==target){
			return true;
		}
		for(int i=p;i<n;i++){
			if(solve(i+1, t+a[i], target)){
				return true;
			}
		}
		return false;

	}
}
