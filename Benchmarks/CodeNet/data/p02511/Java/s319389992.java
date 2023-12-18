import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(in.hasNextInt()){
			int n=in.nextInt();
			if(n==0)break;
			int p=in.nextInt(),s=p,e;

			String l="";
			if(n==1){
				System.out.println(p);
				continue;
			}
			for(int i=1;i<n;i++){
				e=in.nextInt();p++;
				if(e!=p){
					l+=(l.equals("")?"":",")+s+((s!=p)?("-"+p):"");
					s=e;
				}
				if(i==n-1){
					l+=(l.equals("")?"":",")+s+((s!=e)?("-"+e):"");
				}
				p=e;
			}
			System.out.println(l);
		}
	}
}