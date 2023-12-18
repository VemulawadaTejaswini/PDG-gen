import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.nextLine();
		char[] b = new char[1010];
		b=a.toCharArray();
		for(int i=0;i<b.length;i++){
			if(b[i]=='a'&&b[i+1]=='p'&&b[i+2]=='p'&&b[i+3]=='l'&&b[i+4]=='e'){
				b[i]='p';
				b[i+1]='e';
				b[i+2]='a';
				b[i+3]='c';
				b[i+4]='h';
			}
			else if(b[i]=='p'&&b[i+1]=='e'&&b[i+2]=='a'&&b[i+3]=='c'&&b[i+4]=='h'){
				b[i]='a';
				b[i+1]='p';
				b[i+2]='p';
				b[i+3]='l';
				b[i+4]='e';
			}
		}
		System.out.println(b);
	}
}