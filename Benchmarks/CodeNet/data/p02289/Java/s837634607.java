import java.util.*;
import java.io.*;

public class Main {
	static int c=0, H[];
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		H=new int[2000000];
		
		PrintWriter out= new PrintWriter(System.out);
		while(true) {
			String odr=in.next();
			if(odr.equals("end"))break;
			if(odr.equals("insert")) {
				int k=Integer.parseInt(in.next());
				insert(k);
			}
			else if(odr.equals("extract")) {
				out.println(remove());
			}
		}
		out.flush();
	}
	
	static void insert(int k){
		c++;
		H[c]=k;
		
		int i=c/2,s=c;
		while(i>0) {
			if(H[i]>H[s])break;
			int t=H[i];
			H[i]=H[s]; H[s]=t;
			s=i; i/=2;
		}
	}
	
	static int remove() {
		int max=H[1];
		H[1]=H[c];
		maxHeapify(1);
		return max;
	}
	
	static void maxHeapify(int i) {
		if(i*2>c)return;
		
		int max=H[i], u=-1;
		if(H[i*2]>max) {
			max=H[i*2];
			u=i*2;
		}
		if(i*2+1<=c && H[i*2+1]>max) {
			max=H[i*2+1];
			u=i*2+1;
		}
		
		if(u!=-1) {
			int t=H[i];
			H[i]=H[u];
			H[u]=t;
			maxHeapify(u);
		}
	}

}

