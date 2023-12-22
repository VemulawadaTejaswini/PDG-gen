import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String str = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		if((str=bf.readLine())==null)return;
		bf.close();
		int n=Integer.parseInt(str);
		int c=100000;
		for(int i=0;i<n;i++){
			c*=1.05;
			if(c%1000!=0)c+=1000;
			c=(c/1000)*1000;
		}
		System.out.println(c);
	}
}