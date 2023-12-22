import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
		Scanner sc = new Scanner(in);
		char[] c = sc.next().toCharArray();
		sc.close();
		int[] n = new int[4];
		for (i = 0; i < 4; i++) {
			n[i] = c[i] - '0';
		}
		int[] op = {+1, -1};
LABEL:	for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				for (k = 0; k < 2; k++) {
					if(n[0]+op[i]*n[1]+op[j]*n[2]+op[k]*n[3]==7) {
						break LABEL;
					}
				}
			}
		}
		out.print(n[0]);
		out.print(i==0?"+":"-");
		out.print(n[1]);
		out.print(j==0?"+":"-");
		out.print(n[2]);
		out.print(k==0?"+":"-");
		out.print(n[3]);
		out.println("=7");
	}
}
