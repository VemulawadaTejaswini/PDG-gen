import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s=sc.next();
		String str="";
		String temp="";
		
		for(int i=1;i<=s.length();i++){
				
				if(s.charAt(i-1)=='0'){
					str+="0";
					
				}else if(s.charAt(i-1)=='1'){
					str+="1";
					
				}else if(s.charAt(i-1)=='B'){
					
					for(int j=0;j<str.length()-1;j++){
						temp+=str.charAt(j);
					}
					str=temp;
					temp="";
				}
		}
		
		sc.close();
		System.out.print(str);
	}
}