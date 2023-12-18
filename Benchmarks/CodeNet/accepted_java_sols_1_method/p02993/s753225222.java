import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		boolean fin=false;
		int z=1;
		char b=S.charAt(0);
		while(z<4){
			char a=S.charAt(z);
			if(a==b){
				fin=true;
				break;
			}
			b=a;
			z++;
		}
		if(fin)
			System.out.println("Bad");
		else
			System.out.println("Good");
	}
}