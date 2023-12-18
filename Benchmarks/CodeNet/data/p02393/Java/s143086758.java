import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String str = buf.readLine();
			String[] input = str.split(" ");
			int alt = 0;
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			while(true){
				if(a > b){
					alt = a;
					a = b;
					b = alt;
				}else if(b > c){
					alt = b;
					b = c;
					c = alt;
				}else{
					break;
				}
			}
			System.out.println(a + " " + b + " " + c);
		}catch(IOException e){

		}
	}
}
