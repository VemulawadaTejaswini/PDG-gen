import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		String T="";
		for(int i=0;i<S.length();i++){
			T+="x";
		}
		System.out.println(T);
	}
}
