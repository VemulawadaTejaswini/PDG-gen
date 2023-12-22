import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n=in.nextInt(), k=in.nextInt();
			if(n==0 && k==0) break;
			int ss[] = new int[k];
			for(int i=0; i<k; i++){
				ss[i] = in.nextInt();
			}
			for(int i=0; i<n; i++){
				for(int j=0; j<k; j++){
					ss[j] -= in.nextInt();
				}
			}
			int i=0;
			for(i=0; i<k; i++){
				if(ss[i] < 0) break;
			}
			System.out.println(i==k?"Yes":"No");
		}
	}
}