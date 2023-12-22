//package atcoder;
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
//import java.math.BigDecimal;
 
public class Main {
	public static void main(String [] args) {
	    int K,N;
	    
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		int p[] = new int [N];
		for(int i=0;i<N;i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		/*for(int k=0;k<N;k++) {
			System.out.println(p[k]);
		}*/
		int goukei = 0;
		for(int j=0;j<K;j++) {
			goukei = goukei+p[j];
		}
		System.out.println(goukei);
		
	}
}