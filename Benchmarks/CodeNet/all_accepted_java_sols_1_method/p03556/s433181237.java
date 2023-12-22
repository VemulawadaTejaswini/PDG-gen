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
		sc.close();
		int mx=(int)pow(1000000000,0.5)+1;
		for(i=1; i <=mx; i++) {
			if(i*i>n)break;
		}
		out.println((i-1)*(i-1));
	}
}
