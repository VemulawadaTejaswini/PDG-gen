import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int a;
		HashSet<Integer> r = new HashSet<>();
		int cnt32=0;
		for(i=0;i<n;i++) {
			a = parseInt(sc.next());
			if(a<3200) {
				r.add(a/400);
			} else {
				cnt32++;
			}
		}
		sc.close();
		int mx = r.size()+cnt32;
//		if(mx>8)mx=8;
		int mn = r.size();
		if(mn<1)mn=1;
		out.print(mn);
		out.print(" ");
		out.println(mx);
	}
}
