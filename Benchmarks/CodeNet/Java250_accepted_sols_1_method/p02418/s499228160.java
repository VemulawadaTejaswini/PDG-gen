import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		String a=s.next(),b=s.next();
		outer:
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				if(a.charAt((i+j)%a.length())!=b.charAt(j))
					continue outer;
				//System.err.printf("%d %d\n",i,j);
			}
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}