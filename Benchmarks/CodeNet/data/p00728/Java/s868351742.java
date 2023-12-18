import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int i = 0;
		int n = 0;
		int w = 0;
		while(w==0){
			s = sc.nextInt();
			if(s==0){
				break;
			}
			int[] a = new int[s];
			for(i=0;i<s;i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			for(i=1;i<s-1;i++){
				n = n + a[i];
			}
			n = n/(s-2);
			System.out.println(n);
			s = 0;
			i = 0;
			n = 0;
			w = 0;
		}
	}
}