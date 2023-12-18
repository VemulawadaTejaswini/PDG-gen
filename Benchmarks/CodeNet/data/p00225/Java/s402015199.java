import java.util.Scanner;
public class Main{
	public static void main(String [] agrs){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			String a[]=new String[n];
			for(int i=0;i<n;i++){
				a[i]=sc.next();
			}
			boolean ss=true;
			int []m=new int [26];
			int []mm=new int [26];
			for(int j=0;j<a.length;j++){
				m[a[j].charAt(0)-'a']++;
				mm[a[j].charAt(a[j].length()-1)-'a']++;
			}
			for(int j=0;j<26;j++){
				if(m[j]!=mm[j])ss=false;
			}
			if(ss)System.out.println("OK");
			else if(!ss)System.out.println("NG");
		}

	}
}