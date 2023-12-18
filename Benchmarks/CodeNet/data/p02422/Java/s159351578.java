import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		String ord,p,str=sc.next();
		int a,b,n=sc.nextInt();
		for(int i=0;i<n;i++){
			ord=sc.next();
			a=sc.nextInt();
			b=sc.nextInt();
			if(ord=="print") System.out.println(str.substring(a,b+1));
			if(ord=="reverse"){
				StringBuffer sb=new StringBuffer(str.substring(a,b+1));
				str=str.substring(0,a)+(sb.reverse().toString())+str.substring(b+1);
			}
			if(ord=="replace"){
				p=sc.next();
				str=str.substring(0,a)+p+str.substring(b+1);
			}
		}
	}

}