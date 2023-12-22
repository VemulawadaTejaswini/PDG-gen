import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(), res="";
		for(int i=0; i<s.length(); ++i)
		{
			if(s.charAt(i)=='B') res=res.substring(0, Math.max(0, res.length()-1));
			else res+=Character.toString(s.charAt(i)); 
		}
		System.out.println(res);
		sc.close();
	}

}
