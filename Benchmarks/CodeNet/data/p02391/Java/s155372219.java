import java.io.*;

class Main{
	public static void main(String[] args)throws java.io.IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] ar = str.split("");
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);

		if(a>b){
			System.out.println(a + ">" + b);
		}else if(a<b){
			System.out.println(a + "<" + b);
		}else if(a == b){
			System.out.println(a + "==" + b);
		}
  	}
}