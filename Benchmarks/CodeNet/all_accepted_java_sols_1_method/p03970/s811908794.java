import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String t="CODEFESTIVAL2016";
		while(cin.hasNext()){
			String s=cin.nextLine();
			int n=s.length();
			int res=0;
			for(int i=0;i<n;i++){
				if(t.charAt(i)!=s.charAt(i))res++;
			}
			System.out.println(res);
			
		}
	}
}