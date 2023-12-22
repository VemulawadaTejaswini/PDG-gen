import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int x = parseInt(sc.next());
		int[] m = new int[n];
		int sum = 0;
		int mn = x;
		for (i = 0; i < n; i++) {
			m[i] = parseInt(sc.next());
			sum += m[i]; 
			if(m[i] < mn)mn = m[i]; 
		}
		sc.close();
		out.println(n+(x-sum)/mn);
	}
}
