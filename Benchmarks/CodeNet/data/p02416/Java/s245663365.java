import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		char[] c;
		int sum;
		while(true){
			sum = 0;
			str = buf.readLine();
			if(Integer.parseInt(str) == 0)
				break;
			c = str.toCharArray();
			for(int i=0; i<c.length ; i++){
				sum += Integer.parseInt(Character.toString(c[i]));
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb);

	}
}