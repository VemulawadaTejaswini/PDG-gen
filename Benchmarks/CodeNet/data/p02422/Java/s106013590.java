import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a,b;
		for(int i=0 ;i<h ;i++){
			String[] str1 = br.readLine().split(" ");
			a = Integer.parseInt(str1[1]);
			b = Integer.parseInt(str1[2]);
			if(str1[0].equals("reverce")){
				sb.append(str.substring(a,b+1));
				String x = sb.reverse().toString();
				sb.setLength(0);
				sb.append(str);
				sb.replace(a,b+1,x);
				str = sb.toString();
				sb.setLength(0);
			}
			if(str1[0].equals("replace")){
				sb.append(str);
				sb.replace(a,b+1,str1[3]);
				str = sb.toString();
				sb.setLength(0);
			}
			if(str1[0].equals("print")){
				System.out.println(str.substring(a,b+1));
			}
		}
	}
}