import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashSet<String> A=new HashSet<>();
		int n=in.nextInt();
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			char odr=in.next().charAt(0);
			String str=in.next();
			
			if(odr=='i') {
				A.add(str);
			}
			else if(odr=='f')out.println((A.contains(str))?"yes" : "no");
		}
		out.flush();
	}

}

