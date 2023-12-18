import java.io.*;
public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int W=Integer.parseInt(st[0]);
		int H=Integer.parseInt(st[1]);
		int x=Integer.parseInt(st[2]);
		int y=Integer.parseInt(st[3]);
		int r=Integer.parseInt(st[4]);
		int con1=x+r;
		int con2=x-r;
		if(con1<=W&&con2>=0){
			con1=y+r;
			con2=y-r;
			if(con1<=H&&con2>=0)System.out.println("Yes");
			else System.out.println("No");
		}else System.out.println("No");
	}}