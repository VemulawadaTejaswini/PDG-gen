import java.util.*;

import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		sc.close();
		for(i=1;i<=9;i++) {
			if(n<=i*111) {
				break;
			}
		}
		System.out.println(i*111);
	}
}
