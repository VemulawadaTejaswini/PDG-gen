import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		String[] s = {"Positive", "Zero", "Negative"};
		int ans = 0;
		if(a>0 && b>0) {
			ans=0;
		} else if(a<=0 && b>=0) {
			ans=1;
		} else if(a<0 && b<0) {
			int c=b-a;
			if(c%2==0) {
				ans=2;
			} else {
				ans=0;
			}
		} 
		out.println(s[ans]);
	}
}
