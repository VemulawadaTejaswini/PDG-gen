import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0 ;i<h ;i++){
			String[] str1 = br.readLine().split(" ");
			int a = Integer.parseInt(str1[1]);
			int b = Integer.parseInt(str1[2]);
			switch(str1[0]){
			case "reverce":
				sb.append(str.substring(a,b+1));
				String x = sb.reverse().toString();
				sb.setLength(0);
				sb.append(str);
				sb.replace(a,b+1,x);
				str = sb.toString();
				sb.setLength(0);
				break;
			case "replace":
				sb.append(str);
				sb.replace(a,b+1,str1[3]);
				str = sb.toString();
				sb.setLength(0);
				break;
			case "print":
				System.out.println(str.substring(a,b+1));
				break;
			}
		}
	}
}