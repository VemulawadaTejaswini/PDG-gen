import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			int n=Integer.parseInt(in.next()),x=Integer.parseInt(in.next());
			if(n==0 && x==0)break;
			int cnt=0;
			for(int i=1;i<=n-2;i++) {
				for(int j=i+1;j<=n-1;j++) {
					for(int k=j+1;k<=n;k++) {
						if(i+j+k==x)cnt++;
					}
				}
			}
			out.println(cnt);
		}
		out.flush();
	}

}
