import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		long lng = Long.parseLong(s);
		String[] str=s.split("");
		int top=Integer.parseInt(str[0]);
		int answer=0;

		for(int i=0;i<str.length;i++){
			int n=Integer.parseInt(str[i]);
			answer=answer+n;
		}
		if(answer<(str.length-1)*9+top-1){
			answer=(str.length-1)*9+top-1;
		}
		System.out.println(answer);
	}
}
