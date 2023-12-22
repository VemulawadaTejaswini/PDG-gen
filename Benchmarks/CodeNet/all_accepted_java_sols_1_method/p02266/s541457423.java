

import java.util.Scanner;
import java.util.Stack;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		Stack<Integer> s3=new Stack<>();
		
		int sum=0;
		int a;
		String str=scan.nextLine();
		int n=str.length();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<n;i++){
			char c=ch[i];
			if(c=='\\'){
				s1.push(i);
			}
			else if(c=='/'&&s1.size()>0){
				int j=s1.pop();
				sum+=i-j;
				a=i-j;
				while(s2.size()>0&&s2.peek()>j){
					a+=s3.pop();
					s2.pop();
				}
				s2.push(j);
				s3.push(a);
			}
		}
		int m=s3.size();
		int[] ans=new int[m];
		System.out.println(sum);
		System.out.print(m);
		for(int i=m-1;i>=0;i--)
			ans[i]=s3.pop();
		for(int i=0;i<m;i++)
			System.out.print(" "+ans[i]);

		System.out.println();
	}

}

