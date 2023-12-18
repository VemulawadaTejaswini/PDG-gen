import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
		String x=sc.next();
		long sum=0;
		for(int i=0;i<x.length();i++){
			char c=x.charAt(i);
			if(c>='0'&&c<='9'){
				long m=c-'0';
				sum+=m;
			}
		}
		if(sum==0){
			break;
		}
		System.out.println(sum);
		}
	}
}