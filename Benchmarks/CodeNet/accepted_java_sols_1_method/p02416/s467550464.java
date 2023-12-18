import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String x;
		int ans;
		while(true){
			x=scan.next();
			ans=0;
			if(x.equals("0")) break;
			for(int i=0;i<x.length();i++){
				ans=ans+x.charAt(i)-'0';
			}
			System.out.println(ans);
		}
		scan.close();
	}
}