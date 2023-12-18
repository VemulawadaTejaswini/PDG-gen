import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2="";
		char[] chr=str.toCharArray();
		for(int j=0;j<str.length();j++){
			str2+=chr[str.length()-j-1];
		}
		System.out.println(str2);
		sc.close();
	}
}