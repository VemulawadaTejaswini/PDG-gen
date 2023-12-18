import java.io.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str=input.readLine();
		int n=Integer.parseInt(str);
		String str2=input.readLine();
		String[] arr=str2.split(" ");
		int[] number=new int[n];

		for(int i=0;i<n;i++){
			number[n-i-1]=Integer.parseInt(arr[i]);
		}
		for(int i=0;i<number.length;i++){
			sb.append(number[i]);
			if(!(i==n-1)){
			sb.append(" ");
			}
		}
	
		
		System.out.println(sb);
	}
}