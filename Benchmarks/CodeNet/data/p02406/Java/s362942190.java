import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		StringBuilder sb = new StringBuilder();
		

		for(int j=3; j<=n; j++){
			if(j%3==0){
				sb.append(" "+j+" ");
			}			
			if(j>10 && j%10==3){
				sb.append(j);
			}
		}
			System.out.print(sb);

	}
}