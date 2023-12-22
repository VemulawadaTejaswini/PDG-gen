import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		String str;
		char[] c;
		int sum;
		while((str = buf.readLine()) != null){
			if(str.equals("0"))
				break;
			sum = 0;
			c = str.toCharArray();
			for(int i=0; i<c.length ; i++){
				sum += Integer.parseInt(Character.toString(c[i]));
			}
			System.out.println(sum);
		}

	}
}