import java.util.Scanner;
public class　Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char t[]=s.toCharArray();
		boolean[] b=new boolean[s.length()];
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(t[i]))b[i]=true;
			else if(Character.isLowerCase(t[i]))b[i]=false;
		}
		
		for(int i=0;i<s.length();i++){
			if(b[i]==false)System.out.print(Character.toUpperCase(t[i]));
			else if(b[i]==true)System.out.print(Character.toLowerCase(t[i]));
		}
		System.out.printf("\n");
		sc.close();
		System.exit(0);
	}

}