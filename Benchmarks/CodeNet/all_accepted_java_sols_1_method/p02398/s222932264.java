import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		String[] str2=str.split(" ");
		int a=Integer.parseInt(str2[0]);
		int b=Integer.parseInt(str2[1]);
		int c=Integer.parseInt(str2[2]);
		int ans=0;

		for(int i=a;i<b+1;i++){
			if(c%i==0){
			ans++;
			}
		}
		System.out.println(ans);
	}
}