import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int i=1;
		String str=input.readLine();
		int a=Integer.parseInt(str);
		while(true){
		if(a==0){
			break;
		}
		sb.append("Case ").append(Integer.toString(i++)).append(": ").append(Integer.toString(a)).append("\n");


		}
		System.out.print(sb);
	}
}