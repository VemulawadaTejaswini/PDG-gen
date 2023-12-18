import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		String n=sc.next();
		long sum=0;
		for(int i=0;i<n.length();i++){
			char c=n.charAt(i);
			if(c>='0'&&c<='9'){
				long m=c-'0';
				System.out.print(m+" ");
				sum+=m;
			}
		}
		System.out.println(sum);
	}
}