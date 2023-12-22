import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";

		str=bfr.readLine();
		int res=Integer.parseInt(str);
		int goukei=0;
		if(res%10==1) goukei++; res=res/10;
		if(res%10==1) goukei++; res=res/10;
		if(res%10==1) goukei++;

		System.out.println(goukei);

	}
}