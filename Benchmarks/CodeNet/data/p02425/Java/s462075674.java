import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean flag[]=new boolean[64];
		
		int n=in.nextInt();
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<n;i++) {
			int odr=Integer.parseInt(in.next());
			
			switch(odr){
				case 0:
					int index0=Integer.parseInt(in.next());
					out.println((flag[index0])? 1:0);
					break;
					
				case 1:
					int index1=Integer.parseInt(in.next());
					flag[index1]=true;
					break;
					
				case 2:
					int index2=Integer.parseInt(in.next());
					flag[index2]=false;
					break;
					
				case 3:
					int index3=Integer.parseInt(in.next());
					flag[index3]=(flag[index3])? false:true;
					break;
					
				case 4:
					int cnt1=0;
					for(int j=0;j<64;j++)if(flag[j])cnt1++;
					if(cnt1==64)out.println(1);
					else out.println(0);
					break;
					
				case 5:
					int cnt2=0;
					for(int j=0;j<64;j++)if(flag[j])cnt2++;
					if(cnt2>0)out.println(1);
					else out.println(0);
					break;
					
				case 6:
					int cnt3=0;
					for(int j=0;j<64;j++)if(flag[j])cnt3++;
					if(cnt3==0)out.println(1);
					else out.println(0);
					break;
					
				case 7:
					int cnt4=0;
					for(int j=0;j<64;j++)if(flag[j])cnt4++;
					out.println(cnt4);
					break;
					
				case 8:
					long dec=0;
					for(int j=0;j<64;j++) {
						if(flag[j]) {
							dec+=pow(j);
						}
					}
					out.println(Long.toUnsignedString(dec));
					out.flush();
					break;
			}
		}
		out.flush();
	}
	
	static long pow(int p) {
		long res=1;
		for(int i=0;i<p;i++)res*=2;
		return res;
	}

}

