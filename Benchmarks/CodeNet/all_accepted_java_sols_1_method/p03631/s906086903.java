import java.util.Scanner;

class Main{
	public static void main(String[] args){
		String str;
		Scanner stdIn = new Scanner(System.in);
		str = stdIn.nextLine();
		StringBuffer strbuf = new StringBuffer(str);
		String str_rev = strbuf.reverse().toString();

		if(str.equals(str_rev)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}