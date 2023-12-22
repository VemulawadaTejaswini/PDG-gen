import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		sc.close();
		int[] a = new int[4];
		for(int i = 0 ; i < 4 ; i++) a[i] = s.charAt(i) - 48;
		int sum , nn;
		int[] b = new int[3];
		char[] q = new char[3];
		for(int i = 0 ; i < 8 ; i++){
			nn = i;
			sum = a[0];
			for(int j = 0 ; j < 3 ; j++){
				b[j] = 1 & nn;
				nn /= 2;
				if(b[j] == 0){
					sum += a[j + 1];
					q[j] = '+';
				}else{
					sum -= a[j + 1];
					q[j] = '-';
				}
			}
			if(sum == 7){
				ou.print("" + a[0] + q[0] + a[1] + q[1] + a[2] + q[2] + a[3] + "=7\n");
				break;
			}
		}
		ou.flush();
    }
}