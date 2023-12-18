import java.util.Arrays;
import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		char[] c=s.next().toCharArray();
		for(int i=s.nextInt();i>0;i--) {
			switch(s.next()){
			case "replace":
				int bufa=s.nextInt(),bufb=s.nextInt();
				String in=s.next();
				for(;bufa<=bufb;bufa++)
					c[bufa]=in.charAt(in.length()-1-bufb+bufa);
				break;
			case "reverse":
				reverse(c,s.nextInt(),s.nextInt());
				break;
			case "print":
				System.out.println(
						String.valueOf(
								Arrays.copyOfRange(c,s.nextInt(),s.nextInt()+1)
								)
						);
				break;
			}
		}
	}


	public static void swap(char[] c, int a, int b){
		char x=c[b];
		c[b]=c[a];
		c[a]=x;
	}
	public static void reverse(char[] c, int l, int r){
		int buf=(l+r+1)/2;
		for(int i=l; i<buf; i++){
			swap(c,i,r-i+l);
		}
	}
}