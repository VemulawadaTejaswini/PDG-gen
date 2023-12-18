import java.io.*;

class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str=br.readLine();
		
		int i=0;
		
		do{
			i++;
			sb.append("Case ").append(i).append(": ").append(str).append("\n");
			str=br.readLine();
			
		}while(!str.equals("0"));
		System.out.print(sb.toString());
	}
}