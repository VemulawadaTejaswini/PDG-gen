import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[] i=str.split(" ");
		int a=Integer.parseInt(i[0]);
		int b=Integer.parseInt(i[1]);
		int x=a/b;int y=a%b;double z=(double)a/(double)b;
		System.out.print(x+" "+y+" ");
		System.out.printf("%.8f\n",z);
	}
}