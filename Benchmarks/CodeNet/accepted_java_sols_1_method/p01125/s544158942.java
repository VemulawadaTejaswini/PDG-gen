import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			int xs[] = new int[n], ys[] = new int[n], fs[] = new int[n];
			for(int i=0; i<n; i++){
				xs[i] = in.nextInt();
				ys[i] = in.nextInt();
				fs[i] = 0;
			}
			int cx = 10, cy = 10;
			int m = in.nextInt();
			for(int i=0; i<m; i++){
				String d = in.next();
				int dis = in.nextInt();
				for(int j=0; j<dis; j++){
					if(d.equals("N")) cy+=1;
					else if(d.equals("S")) cy-=1;
					else if(d.equals("E")) cx+=1;
					else if(d.equals("W")) cx-=1;
					for(int k=0; k<n; k++){
						if(xs[k] == cx && ys[k] == cy){
							fs[k] = 1;
						}
					}
				}
			}
			int cnt=0;
			for(int i=0; i<n; i++){
				cnt += fs[i];
			}
			System.out.println((cnt==n)?"Yes":"No");
		}
	}
}