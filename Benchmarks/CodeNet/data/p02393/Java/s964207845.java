import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bf;

		String str = br.readLine();
		String[] array = str.split(" ");

		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);

		if(a > b){
			bf = a;
			a = b;
			b = bf;
		}
		if(b > c){
			bf = b;
			b = c;
			c = bf;
		}
		if(a > b){
			bf = a;
			a = b;
			b = bf;
		}

		System.out.println(a + " " + b + " " + c);
	}
}