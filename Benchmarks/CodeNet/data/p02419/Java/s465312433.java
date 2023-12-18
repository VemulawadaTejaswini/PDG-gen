import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		String W=sc.next(),T;
		int ans=0;
		while(true){
			T=sc.next();
			T=T.toLowerCase();
			if(T.equals("END_OF_TEXT"))break;
			if(T.equals(W))ans++;
		}
		System.out.println(ans);
	}

}