import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int i,n,c=1;
		try {
			while(s!=null){
				s=r.readLine();
				n = Integer.parseInt(s);
				for(i=1;i<=n;i++)c*=i;
				System.out.println(c);
			}
		} catch (Exception err) {
			System.exit(0);
		}
	}
}