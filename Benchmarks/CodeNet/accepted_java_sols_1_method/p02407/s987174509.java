import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		String str=br.readLine();
		int n=Integer.parseInt(str);
		
		String[] a=br.readLine().split(" ");
		for(int i=n-1;i>=0;i--){
			sb.append(a[i]);
			if(i!=0){
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}