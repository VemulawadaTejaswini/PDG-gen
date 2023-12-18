import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		boolean P=false,W=false,G=false,Y=false;
		String S;
		for(int i=1;i<N;i++) {
			S=sc.next();
			if(S.equals("P"))P=true;
			else if(S.equals("W"))W=true;
			else if(S.equals("G"))G=true;
			else if(S.equals("Y"))Y=true;
		}
		if(P && W && G) {
			if(Y)System.out.println("Four");
			else System.out.println("Three");
		}

	}

}
