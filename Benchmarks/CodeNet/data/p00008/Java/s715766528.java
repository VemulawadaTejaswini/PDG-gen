import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String s="";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t[] = new int[19];
		for(int i=0;i<9;i++)t[i]=t[18-i]=i+1;t[9]=10;
		while((s = bf.readLine())!=null){
			int n = Integer.parseInt(s);
			int a=0;for(int i=0;i<19;i++)if(n>=i && (n-i)<19)a+=t[i]*t[n-i];
			System.out.println(a);
		}
	}
}