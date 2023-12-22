import java.util.Scanner;
class Main{
	public static void main(String[] args){
 		int n=0;
		String s;
		char m;
 		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		for(n=0;n<s.length();n++){
		  m=s.charAt(n);
		  if(m>='A' && m<='Z')
		   System.out.print((char)(m+32));
		  else if(m>='a' && m<='z')
		   System.out.print((char)(m-32));
		  else
		   System.out.print(m);
		   }
		System.out.println();
		}
}
