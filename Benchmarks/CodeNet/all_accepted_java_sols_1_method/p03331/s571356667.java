import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";

		str=bfr.readLine();
		int souwa=Integer.parseInt(str);

		int kuraiwa=114514;

		int wa1=0,wa2=0;
		int tmp1=0,tmp2=0;
		for(int i=1; i<=(souwa+1)/2; i++) {
			tmp1=i;
			tmp2=souwa-i;
			while(tmp1>0) {
				wa1=wa1+tmp1%10;
				tmp1=tmp1/10;
			}
			while(tmp2>0) {
				wa2=wa2+tmp2%10;
				tmp2=tmp2/10;
			}
			if(kuraiwa>wa1+wa2) {
				kuraiwa=wa1+wa2;
			}
			wa1=0; wa2=0;
		}
		System.out.println(kuraiwa);
	}
}