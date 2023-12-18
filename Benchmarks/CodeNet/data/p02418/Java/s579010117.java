import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		String s="vanceknowledgetoad";//sc.nextLine();
		String p="advance";//sc.nextLine();
		String ans=null;
		for(int i=0;i<s.length();i++){
			if(s.indexOf(p)!=-1){
				ans="Yes";
				break;
			}
			s=s.substring(s.length()-1)+s.substring(0,1);
		}
		if(ans.equals(""))ans="No";
		System.out.println(ans);
	}

}