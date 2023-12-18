import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		String[] str2=str.split(" ");
		int W=Integer.parseInt(str2[0]);
		int H=Integer.parseInt(str2[1]);
		int x=Integer.parseInt(str2[2]);
		int y=Integer.parseInt(str2[3]);
		int r=Integer.parseInt(str2[4]);
		if(x+r<W&&x-r>0&&y+r<H&&y-r>0){
		System.out.println("Yes");

		}else{
		System.out.println("No");
		
		}

	}
}