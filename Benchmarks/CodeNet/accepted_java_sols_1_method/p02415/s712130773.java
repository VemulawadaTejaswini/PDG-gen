import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String s= sc.nextLine();
		char c[]= s.toCharArray();

		for(int i=0;i<c.length;++i){
			if(Character.isUpperCase(c[i])) c[i]=Character.toLowerCase(c[i]);
			else if(Character.isLowerCase(c[i])) c[i]=Character.toUpperCase(c[i]);
		}

		StringBuilder sb = new StringBuilder(new String(c));

		System.out.println(sb.toString());


	}
}
